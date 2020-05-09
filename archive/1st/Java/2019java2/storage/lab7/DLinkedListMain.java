
public class DLinkedListMain {
	public static void main(String args[]){
		DLinkedList list1=new DLinkedList();
		list1.insertFirst("Kim");
		list1.insertFirst("Choi");
		list1.insertFirst("Lee");
		list1.insertFirst("Park");
		list1.deleteNode("Lee");
		list1.insertFirst("Yoo");
		list1.insertFirst("Hong");
		list1.insertLast("Sun");
		//L.deleteLast();
		list1.printList();
		list1.findData("Choi");//4번째 데이터가 choi 
		System.out.println(list1.findData("Choi"));
		list1.deleteLast();
		list1.deleteFirst();
		list1.printList();
	}
}
    