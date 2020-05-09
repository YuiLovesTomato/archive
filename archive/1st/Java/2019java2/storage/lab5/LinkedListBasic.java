class LinkedList2 {
	String data;
	LinkedList2 link;
}

public class LinkedListBasic {

	static void printSize(LinkedList2 p) {
		int sum=0;
		while (p != null) {
			sum++;
			p = p.link;
		}
		System.out.printf("list2's size: %d\n", sum);
	}
	static void printList(LinkedList2 p) {
		while (p != null) {
			System.out.print(" " + p.data);
			/*	I can't get what this if-syntax does.
			if (p.data == "orange") {
				p.data = "durian";
			}
			*/
			p = p.link;
		}
		System.out.println();
	}

	public static void main(String[] ar) {
		// list1 = ("Kim", "Lee", "Park")
		LinkedList2 list1, list2;
		LinkedList2 tmp, tail, p;

		tmp = new LinkedList2();
		tmp.data = "Kim";
		tmp.link = null;
		list1 = tmp; // �� ���� �ּҸ� list1�� ����. ���� list1�� ù��° ���Ұ� �����.
		// �ι�° ����
		tmp = new LinkedList2();
		tmp.data = "Lee";
		tmp.link = null;
		list1.link = tmp; // 2��° ���Ҹ� ���� ����
		// ����° ����
		tmp = new LinkedList2();
		tmp.data = "Park";
		tmp.link = null;
		list1.link.link = tmp;
		System.out.print("list1 = (");
		System.out.print(list1.data + ", ");
		System.out.print(list1.link.data + ", ");
		System.out.println(list1.link.link.data + ")");

		// 1. list2 = ("apple", "strawberry", "orange", "banana", "melon") ������.
		tmp = new LinkedList2();
		tmp.data = "apple";
		tmp.link = null;
		list2 = tmp;
		tail = tmp; // last�� ������ ��带 ����Ų��

		tmp = new LinkedList2();
		tmp.data = "strawberry";
		tmp.link = null;
		tail.link = tmp;
		tail = tmp;

		tmp = new LinkedList2();
		tmp.data = "orange";
		tmp.link = null;
		tail.link = tmp;
		tail = tmp;

		tmp = new LinkedList2();
		tmp.data = "banana";
		tmp.link = null;
		tail.link = tmp;
		tail = tmp;

		tmp = new LinkedList2();
		tmp.data = "melon";
		tmp.link = null;
		tail.link = tmp;
		tail = tmp;

		printList(list2);

//		tmp= new LinkedList2();
//		tmp.data="apple"; tmp.link=null;
//		list2 = tmp;

		// ���ο� �����߰��϶�
		// 2. list2 = ("pineapple", "apple", "strawberry", "orange", "banana", "melon")
        tmp = new LinkedList2();
		tmp.data = "pineapple";
		tmp.link = list2;
		list2 = tmp;
		printList(list2);

		// �ι�° ���Ҹ� �����϶�.
		// 3. list2 = ("pineapple", "strawberry", "orange", "banana", "melon")
		tmp = new LinkedList2();
		tmp.link = list2.link.link;
		list2.link.link=null;
		list2.link=null;
		list2.link=tmp.link;
		printList(list2);

		// 4. list2�� ������ ������ ����Ͽ� ����϶�.
        printSize(list2);

		// 5. list2�� �������� "durian"�� �߰��϶�
		// list2 = ("pineapple", "strawberry", "orange", "banana", "melon", "durian")
		tmp = new LinkedList2();
		tmp.data = "durian";
		tmp.link = null;
		tail.link = tmp;
		tail = tmp;
		printList(list2);

		// 6. ����° ������ "orange"�� "grape"�� �����϶�
        list2.link.link.data = "grape";
		printList(list2);
	}
}
