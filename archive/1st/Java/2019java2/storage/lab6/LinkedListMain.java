public class LinkedListMain {

	public static void main(String[] args) {
		
		// list1 = ("Kim", "Lee", "Park")
		LinkedList list1;
		list1 = new LinkedList();
		list1.addLastNode("Kim");
		list1.addLastNode("Lee");
		list1.addLastNode("Park");
		list1.addLastNode("Choi");
		list1.printList();
	
		// list2 = ("Apple", "Banana", "Orange", "Grape")
		LinkedList list2;
		list2 = new LinkedList();
		list2.addLastNode("Apple");
		list2.addLastNode("Banana");
		System.out.println("deleted first :" + list2.deleteFirst());
		list2.addLastNode("Orange");
		list2.addLastNode("Grape");
		list2.printList();	//B O G
		list2.addFirst("Pineapple");
		list2.printList();	//P B O G
		list2.deleteLast();
		list2.printList();		//P B O
		list2.replaceNode("Orange", "Durian");
		list2.printList();		//P B D
		System.out.println("count : " + list2.getNumberOfNode());	//3
		list2.reverseList();
		list2.printList();	//D B P
		list2.deleteNode(3);	
		list2.printList();	//D B
		ListNode pNode;
		pNode = list2.findNode("Banana");
		list2.insertAfter(pNode, "Strawberry");
		list2.printList();	//D B S
		
	}
}

class ListNode {
	String data;
	ListNode link;
	public ListNode()
	{
		data = null;
		link = null;
	}
	public ListNode(String val)
	{
		data = val;
		link = null;
	}
}

class LinkedList {

	private ListNode head;  // 첫번째 노드의 주소를 가지는 참조변수
	private ListNode tail;  //마지막 노드의 주소를 가지는 참조변수
	public LinkedList() { // 생성자
	}
	
	// 리스트의 마지막에 원소를 추가
	public void addLastNode(String x) {
		ListNode tmp = new ListNode();
		tmp.data = x;
		if (head==null) {
			head = tmp;
		} else {
			tail.link = tmp;
		}
			tail = tmp;
	}

	// 모든 노드들을 한번씩 방문하여 내용 출력
	public void printList() {
		ListNode p;
		p = head;
		System.out.print("(");
		// 원소를 방문하는 방식 1
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.link;
		}
		
		// 원소를 방문하는 방식2 테스트해보라
//		for (p = head; p != tail; p = p.link) {
//			System.out.print(p.data + " ");
//		}
//		System.out.print(p.data + " ");
		System.out.println(")");
	}
	
	public void addFirst(String x) {
		ListNode tmp = new ListNode();
		tmp.data = x;
		if (head == null) {
			tmp.link = null;
		} else {
			tmp.link = head;
		}
		head = tmp;
	}
	//첫번째 원소를 제거하자.
	public String deleteFirst(){
		String x = "";
		if (head == null) {
			return "no head";
		}
		x = head.data;
		head.data=null;
		head = head.link;
		if (head == null)
			tail = null;
			
		return x;
	}
	//마지막 원소를 제거하자.
	public String deleteLast() {
		ListNode p = head;
		ListNode q = null;
		String x = "";
		tail.data = null;
		
		if (head==null && tail==null)
			return "no tail";

		while (p.link != null) {
			q = p;
			p = p.link;
		}
		x = p.data;
		q.link = null;
		tail = q;

		return x;
	}
	public int getNumberOfNode() {
		ListNode tmp = head;
		int count = 0;
		
		while (tmp != null) {
			tmp=tmp.link;
			count++;
		}

		return count;
	}
	// 재귀방식으로 원소의 갯수를 계산할 수 있다.
	public int getCountRec(ListNode p) {
		if (p == null) { return 0; }
		return 1 + getCountRec(p.link);
	}
	public int getCount() {
		return getCountRec(head);
	}
	// String x를 String y 로 교체
	public void replaceNode(String x, String y) {
		ListNode p;
		p = head;
		// 원소를 방문하는 방식 1
		while (p != null) {
			if(p.data.compareTo(x)==0) { 
				System.out.println("data :" + p.data);
			}
			p = p.link;
		}
		p = head;
		// 원소를 방문하는 방식 2
		while (p != null) {
			if(p.data.equals(x)) { 
				p.data = y;
			}
			p = p.link;
		}
	}
	public void reverseList() {
		ListNode p, q, r;
		p = head; 
		q = null;
		r = null;
		tail = p;
		// 원소를 방문하는 방식 1
		while (p != null) {
			r = q;
			q = p;
			p = p.link;
			q.link = r;
		}
		head = q;
	}
	// n번째 노드를 삭제
	public void deleteNode(int n) {
		ListNode p;
		ListNode q;
		int count = 0;
		if (head == null) { 
			System.out.println(" List is empty");
			return;
		}
		if (n == 0) { 
			deleteFirst();
			return;
		}
		p = head; q = null;
		// n-1번 노드를 찾는다. q는 n-1번째 노드의 참조변수
		for (count = 0; p.link != null && count < n - 1; count++){
			q=p;
			p = p.link;
		}
		
		if (count == (n - 1)) {
			q.link = p.link; // n-1번째 노드의 링크에 n+1번째 노드의 주소를 넣는다.
			if (q.link == null) { //만일 n+1번째노드가 없다면, 다시 말해 n번 노드가 마지막 노드라면 
				tail = q;
			 }
		} else {
			System.out.println(" Node has less than " + n + " elements");
		}
	}
	ListNode findNode(String x) {
		ListNode p = head;
		
		while (p != null) {
			if (p.data == x) {
				return p;
			}
			p=p.link;
		}
		
		return null;
	}
	public void insertAfter(ListNode prevNode, String x) {
		if ( prevNode == null) {
			System.out.println("The given previous node can not be null");
			return;
		} else {
			ListNode newNode = new ListNode();
			newNode.data = x;
			newNode.link = prevNode.link;
			prevNode.link = newNode;
		}
	}
	public void deleteList() {
		head = null;
	}
}