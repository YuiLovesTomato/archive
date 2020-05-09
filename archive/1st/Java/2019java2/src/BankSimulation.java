
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
		this.arrivals = arrivals; // �����ð�
		this.service = service; // �䱸�Ǵ� ���� �ð�
		this.priority = priority; // �켱����
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
		// �մ� 7�� �������� �� �� ������ ���α׷��� �����ϰ� �ϱ� ���� �ʱⰪ �ο�
		int[] arrivals = { 0, 15, 20, 20, 30, 40, 45 };// �����ð�
		int[] service = { 20, 5, 10, 10, 15, 20, 5 }; // �䱸�Ǵ� ���� �ð�
		int[] priority = { 3, 1, 2, 2, 1, 0, 1 }; // �켱����
		int[] clerks = { 0, 0 }; // â������
		int clerkSize = clerks.length; // â��������
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
		int queuedI = -1; // ���� ť�� ������ ��
		int serviceTime = 0;
		for (t = 0; t <= numOfMinutes; t = t + 5) { // numOfMinutes �� ������ �ùķ��̼�
			System.out.println(" t = " + t);
			// ���� �մ��� �� �� ����ϰ� �ִ°�? size�� ����غ� �� ������? �մ��� ť�� �����Ų��.
			for (int j = queuedI + 1; j < arrivals.length; j++) {
				if (arrivals[j] <= t) { // enqueue
					queuedI = j;
					Customer c1 = new Customer(j, arrivals[j], service[j], priority[j]);
					System.out.println(j + " ��° �մ� ���� (Enqueued time : " + t + ")");
					simulQ.add(c1); // ť�� �մ��߰�

					start[c1.id] = t; // j��° �մ��� ť����ð��� t
				}
			}
			// ��!!! ť�� ����ϰ� �ִ� �մ��� ȣ���Ѵ�.
			for (i = 0; i < clerkSize && !simulQ.isEmpty(); i++) {
				if (clerks[i] <= 0) { // �����ؾ��ϴ½ð��� 5�к��� ������ ���� i �Ҵ�
					newCustomer = simulQ.remove();

					clerks[i] = newCustomer.service;
					System.out.println(
							"����"+i+ " " + newCustomer.id + " ��° �մ� ���� ���� (Dequeued time : " + t + ")" + "������� ��:" + simulQ.size());
				} else {
					clerks[i] = clerks[i] - 5; // ���������� 5�м�����
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