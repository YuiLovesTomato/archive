
public class DLinkedList {
	private DListNode head, tail;
	public DLinkedList(){
	}
	public void insertFirst(String x){
		DListNode newNode = new DListNode();
		newNode.data = x;
		DListNode p = head;

		if (head == null) {
			head = newNode;
			tail = newNode;
		}

		newNode.rlink = head;
		newNode.llink = tail;
		head.llink = newNode;
		tail.rlink = newNode;
		head = newNode;
	}
	public void insertLast(String x) {
		DListNode newNode = new DListNode(x);
		DListNode p = head;
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		while(p.rlink != null) {
			p = p.rlink;
		}
		p.rlink = newNode;
		newNode.llink = p;
		tail = newNode;
		
	}
	public String deleteFirst() {
		String x = " ";
		if (head == null) {
			return "No element";
		}
		x = head.data;
		head = head.rlink;
		head.llink = null;
		if (head == null) { tail = null; }
		return x;
	}
	public String deleteLast(){
		String x = tail.data;
	    DListNode p = new DListNode();
		DListNode q = new DListNode();
	    while (p.rlink != null) {
	        q=p;
	    	p=p.rlink;
		}
		head.llink = q;
	    q.rlink = head;
	    tail = q;

		return x;
	}
	public int findData(String x){ //Z가 몇 번째 데이터인지를 반환하는 메소드
	    DListNode p = head;
	    int cnt = 0;
	    if (head==null) {
	    	return 0;
		}
	    while (p.rlink != null) {
	    	if (p.data == x)
	    		return cnt;
	    	cnt++;
			p=p.rlink;
		}

	    return -1;
	}
	public void deleteNode(String y){ // 원소 y 를 삭제
	    DListNode p = head;
	    DListNode q = new DListNode();

	    while (p.rlink != null) {
	    	q = p;
	    	p = p.rlink;
		}
		//??? p q w 까지 필요한가?

	}
	public void printList(){
		DListNode p;
		p=head;
		System.out.print("(");
		while(p!=null){
			System.out.print(p.data);
			p=p.rlink;
			if(p!=null){
				System.out.print(", ");
			}
		}
		System.out.println(")");
	}
}
