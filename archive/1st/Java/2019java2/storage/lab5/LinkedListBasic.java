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
		list1 = tmp; // 찍어낸 빵의 주소를 list1에 저장. 드디어 list1에 첫번째 원소가 저장됨.
		// 두번째 원소
		tmp = new LinkedList2();
		tmp.data = "Lee";
		tmp.link = null;
		list1.link = tmp; // 2번째 원소를 끝에 연결
		// 세번째 원소
		tmp = new LinkedList2();
		tmp.data = "Park";
		tmp.link = null;
		list1.link.link = tmp;
		System.out.print("list1 = (");
		System.out.print(list1.data + ", ");
		System.out.print(list1.link.data + ", ");
		System.out.println(list1.link.link.data + ")");

		// 1. list2 = ("apple", "strawberry", "orange", "banana", "melon") 만들어라.
		tmp = new LinkedList2();
		tmp.data = "apple";
		tmp.link = null;
		list2 = tmp;
		tail = tmp; // last는 마지막 노드를 가르킨다

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

		// 선두에 원소추가하라
		// 2. list2 = ("pineapple", "apple", "strawberry", "orange", "banana", "melon")
        tmp = new LinkedList2();
		tmp.data = "pineapple";
		tmp.link = list2;
		list2 = tmp;
		printList(list2);

		// 두번째 원소를 제거하라.
		// 3. list2 = ("pineapple", "strawberry", "orange", "banana", "melon")
		tmp = new LinkedList2();
		tmp.link = list2.link.link;
		list2.link.link=null;
		list2.link=null;
		list2.link=tmp.link;
		printList(list2);

		// 4. list2의 원소의 개수를 계산하여 출력하라.
        printSize(list2);

		// 5. list2의 마지막에 "durian"을 추가하라
		// list2 = ("pineapple", "strawberry", "orange", "banana", "melon", "durian")
		tmp = new LinkedList2();
		tmp.data = "durian";
		tmp.link = null;
		tail.link = tmp;
		tail = tmp;
		printList(list2);

		// 6. 세번째 원소인 "orange"를 "grape"로 변경하라
        list2.link.link.data = "grape";
		printList(list2);
	}
}
