
public class CLinkedList {
	private CListNode head, tail;
	private CListNode temp;

	public void addFirst(int x){
		CListNode cnewNode=new CListNode();
		cnewNode.data=x;
		if(head==null){// 공백리스트라면
			head=cnewNode; 
			tail=cnewNode;
			cnewNode.clink=head;
		}
		else{ //원소가 여러개 존재
			temp=head;
			cnewNode.clink=temp;//새로이 찍은 빵의 링크에 기존의 첫번째원소 참조하도록 함, temp가 참조변수
			CListNode p = head;
			do {
				p = p.clink;
			} while (p.clink != head);
			//마지막 원소의 링크가 새로이 찍은 빵을 가르키도록 함.
			p.clink = cnewNode;
			// tail.clink = cnewNode; tail을 사용하지 않는다고 할 때
			head=cnewNode; // 새빵의 주소를 head에 저장
			//만일 tail을 사용하지 않는다면 
			
		}
	}
	public void deleteLast(){
		if(head==null){
			System.out.println("Nothing to delete");
		}
//		else if(head==tail){//원소가 1개이면
//			head=null; tail=null;
//		}
		else if (head.clink == head) { //원소가 1개이면
			head = null;
			//tail = null;
		}
		else{ //원소가 2개 혹은 그 이상 
			CListNode p, q;
			p=null; q=head;
			//tail을 사용한다면 아래 코드
//			while(q!=tail){
//				p=q; q=q.clink;
//			}
//			tail=p;
			// tail을 사용하지 않는다면 아래코드
			while(q.clink != head) {
				p = q; q = q.clink;
			}
			p.clink=head;
			
		}
	}
	public void print(){
		CListNode p=head;
		if(p!=null){
//			System.out.print(p.data + "->");// 첫번째 원소
//			p= p.clink;
//			while(p!=head){
//				System.out.print(p.data+"->");
//				p=p.clink;
//			}
//			System.out.print(p.data+"->"); //여기까지가 끝
//			p=p.clink;  //마지막->선두원소이동
//			System.out.println("다시 첫번째 원소" + p.data);
			//혹은 아래처럼  출력해도 된다.
			do {
				System.out.print(p.data+ "->");
				p = p.clink;
			} while ( p != head);
			// 원형 연결 리스트임을 확인
			System.out.println(" 다시 첫번째 원소"+ p.data);
		}
		else { System.out.println("empty list");}
	}
	
	// 무한 반복인지 점검 노드를 100회 출력해 본다
	public void printManyTimes(int count){
		int cnt =0;
		CListNode p=head;
		System.out.println("printManyTimes");
		if(p!=null){
			System.out.print(p.data + "->");// 첫번째 원소
			p= p.clink;
			while(cnt < count){
//				if (p == head){
//					System.out.println();
//				}
				System.out.print(p.data+"->");
				cnt++;
				p=p.clink;
			}
			System.out.println();
			
		}
		else { System.out.println("empty list");}
	}
	// 원소 x 를 제거
	public void deleteNode(int x) {
		CListNode current = head;
		CListNode prev = current;
		current = current.clink;

		while (current != head) {
			//System.out.println(current.data);
			if (current.data == x) {
				if (current==tail) { tail = prev;}
				prev.clink = current.clink;
				return;
		    }
			prev = current; // 뒤따라오는  포인터 전진
			current = current.clink; // 첫번째 포인터 전진
		}
		// 위의 코드는 첫번째 원소가 x일때 삭제할 수 없다. 따라서 다음과 같은 코드 추가
		if (current.data == x) {
			head = head.clink;
			if (current==tail) { head = null; tail = null;} // 원소가 하나일때 원소를 제거하므로 공백리스트가 됨
			prev.clink = current.clink;
			return;
	    }
	}
	// 노드의 개수를 계산
	public int getNoofNode(){
		int cnt=0;
		CListNode tmp = new CListNode();
		while (tmp.clink != head) {
			cnt++;
		}
		return cnt;
	}
	public void addLast(int x){ //원형연결리스트 마지막에 원소추가
		//채워라
		CListNode cnewNode=new CListNode();
		cnewNode.data=x;
		if(head==null){// empty list
			head=cnewNode; 
			//tail=cnewNode;
			cnewNode.clink=head;
		}
		else{ //원소가 여러개 존재
			cnewNode.clink=head;//새로이 찍은 빵의 링크에 기존의 첫번째원소 참조하도록 함
			CListNode p = head;
			do {
				p = p.clink;
			} while (p.clink != head);
			p.clink = cnewNode;
			// tail.clink = cnewNode; tail을 사용하지 않는다고 할 때
					
		}
	}
	//  원형 연결 리스트에 원소가 존재하는 지 계산
	public int isEmpty() {
		if (head != null) {
			return 1; // 원소가 존재하면
		}
		return 0; // 원소가 존재하지 않으면
	}
	// 원소 x 가 몇 번째 원소인지를 리턴하라
	public int searchNode(int x) {
		CListNode tmp;
		int count=0;
		if (head == null)
			return count;	//에서를 완성하라. 원소가 없다면 0 리턴
		tmp = head;
		while (tmp.clink != head) {
			if (tmp.data == x) {
				return count;
			}
			count++;
		}
		return -1;	//not found
	}
	public CLinkedList(){	//생성자
	}
}
