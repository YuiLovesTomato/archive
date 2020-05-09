class ListNode {
	int data;
	ListNode link;
	public ListNode() {
	    link = null;
	}
	public ListNode(int v) {
		data = v;
		link = null;
	}
}

public class LinkStack {
	ListNode top;
	public LinkStack(){	//�� ������
		
	}
	void push(int x) {
		ListNode newNode = new ListNode();
		newNode.data=x;
		if(top==null){ // stack empty
			top=newNode;
			top.link=null;
		}
		else {
			newNode.link=top;
			top=newNode;
		}
	}
	int pop() {
		int x;
		if(top==null){System.out.println("Stack underflow");
			return -1;
		}
		else{ 
			x=top.data;
			top=top.link;
			return x;
		}
	}
	// �Ʒ� �޼ҵ���� �����϶�.
	int peek() {
		if (top==null) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			return top.data;
		}
	}
	void delete(){
	    ListNode tmpNode;
	    tmpNode = top.link;
	    top.link = null;
	    top = tmpNode;
	}
	boolean empty(){
		if (top == null) {
			return true;
		} else {
			return false;
		}
	}
}
