import java.util.Scanner;

public class Binsrch {
	int binarysearch(int[] list, int key) {
		int low = 0;
		int high = list.length-1;
		int mid = (high + low)/2;

		if (low > high)
			return -1;

		while (list[mid] != key) {
			mid = (high + low)/2;
			if (list[mid]==key) {
				return mid;
			} else if (list[mid]>key) {
				high = mid-1;
			} else if (list[mid]<key) {
				low = mid+1;
			}
		}
		
		return mid;
	}

	public static void main(String[] args) {
		Binsrch obj = new Binsrch();
		Scanner scan = new Scanner(System.in);
		
		int[] list = {1,2,3,7,9,12,21,23,27};

		for (int i=0; i<list.length; i++) {
			System.out.print(list[i]);
			System.out.print(" ");
		}

		System.out.println();
		System.out.print("Key: ");

		int inputValue = scan.nextInt();
		int result = obj.binarysearch(list, inputValue);

		System.out.println(result);
	}
}
