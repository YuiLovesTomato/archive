
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Customer implements Comparable<Customer> {
	int id;
	int arrivals;
	int service;
	int priority;

	public Customer(int id, int arrivals, int service, int priority) {
		this.id = id;
		this.arrivals = arrivals; // 도착시간
		this.service = service; // 요구되는 서비스 시간
		this.priority = priority; // 우선순위
	}

	@Override
	public int compareTo(Customer target) {
		if (this.priority > target.priority) {
			return 1;
		} else if (this.priority < target.priority) {
			return -1;
		}
		return 0;
	}
}

public class BankSimulation {
	public static void main(String args[]) {
		// 손님 7명 랜덤으로 할 수 있으나 프로그램을 간단하게 하기 위해 초기값 부여
		int[] arrivals = { 0, 15, 20, 20, 30, 40, 45 };// 도착시간
		int[] service = { 20, 5, 10, 10, 15, 20, 5 }; // 요구되는 서비스 시간
		int[] priority = { 3, 1, 2, 2, 1, 0, 1 }; // 우선순위
		int[] clerks = { 0, 0 }; // 창구직원
		int clerkSize = clerks.length; // 창구직원수
		int[] start = new int[7];
		int[] end = new int[7];
		int max = 0;
		int sum = 0;
		int work = 0;
		int i;
		Customer newCustomer;
		int t;
		int numOfMinutes = 120;
		// Queue<Customer> simulQ = new LinkedList<Customer>();
		PriorityQueue<Customer> simulQ = new PriorityQueue<Customer>();
		int queuedI = -1; // 현재 큐에 입장한 고객
		int serviceTime = 0;
		for (t = 0; t <= numOfMinutes; t = t + 5) { // numOfMinutes 분 동안의 시뮬레이션
			System.out.println(" t = " + t);
			// 현재 손님이 몇 명 대기하고 있는가? size를 출력해볼 수 있을까? 손님을 큐에 입장시킨다.
			for (int j = queuedI + 1; j < arrivals.length; j++) {
				if (arrivals[j] <= t) { // enqueue
					queuedI = j;
					Customer c1 = new Customer(j, arrivals[j], service[j], priority[j]);
					System.out.println(j + " 번째 손님 입장 (Enqueued time : " + t + ")");
					simulQ.add(c1); // 큐에 손님추가

					start[c1.id] = t; // j번째 손님의 큐입장시각은 t
				}
			}
			// 띵동!!! 큐에 대기하고 있는 손님을 호출한다.
			for (i = 0; i < clerkSize && !simulQ.isEmpty(); i++) {
				if (clerks[i] <= 0) { // 서비스해야하는시간이 5분보다 작으면 직원 i 할당
					newCustomer = simulQ.remove();

					clerks[i] = newCustomer.service;
					System.out.println(
							"직원"+i+ " " + newCustomer.id + " 번째 손님 서비스 시작 (Dequeued time : " + t + ")" + "대기중인 고객:" + simulQ.size());
				} else {
					clerks[i] = clerks[i] - 5; // 은행직원이 5분서비스함
				}
			}
		}

	for(int n = 0; n<start.length; n++)
	{
		int temp = end[n] - start[n];
		sum += temp;
		if (max < temp) {
			max = temp;
		}
	}

		System.out.println("average :" + (sum / start.length));
		System.out.println("max :" + max);
		System.out.println("notWork :" + (numOfMinutes - work));
	}
}