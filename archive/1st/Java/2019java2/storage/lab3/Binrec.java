import java.util.Scanner;

public class Binrec {

    int binarysearch(int[] list, int key, int low, int high) {
		int index = -1;
		int mid = (low+high)/2;

		if (list[mid]<key) {
			low = mid+1;
			index = binarysearch(list, key, low, high);
		} else if (list[mid] > key) {
			high = mid-1;
			index = binarysearch(list, key, low, high);
		} else if (list[mid] == key) {
			index = mid;
		}

		return index;
    }

    public static void main(String[] args) {
		Binrec obj = new Binrec();
		Scanner scan = new Scanner(System.in);

        int[] list = {1, 2, 3, 7, 9, 12, 21, 23, 27};

		for (int i=0; i<list.length; i++) {
			System.out.print(list[i]);
			System.out.print(" ");
		}

		System.out.println();
		System.out.print("Key: ");

		int inputValue = scan.nextInt();
		int result = obj.binarysearch(list, inputValue, 0, list.length);

		System.out.println(result);
    }
}
