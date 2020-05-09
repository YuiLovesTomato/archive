/**
 * 
 * @author Kim, Jin
 *
 */
package lab4;

class ArrayTest {
	/* Function to reverse arr[] from index start to end */
	static void reverseArray(int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void rotate(int arr[]) {
		int x = arr[arr.length - 1], i;
		for (i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = x;
	}

	//copying array
	static int[] copyArray(int arr[]) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[i];
		}

		return result;
	}

	static void shiftnArray(int arr[], int k) {
		int[] arr2 = copyArray(arr);
		int i = 0;
		while (i < k) {
			arr[i] = arr2[arr2.length - k + i];
			i++;
		}
		i = k;
		while (i < arr2.length) {
			arr[i] = arr2[i - k];
			i++;
		}
	}

	static void insertArray(int arr[], int x, int y) {
		int i = arr.length - 1;
		while (i > x) {
			arr[i] = arr[i - 1];
			i--;
		}
		arr[x] = y;
	}

	static void deleteArray(int arr[], int x) {
		int i = x;
		while (i < arr.length) {
			arr[i-1] = arr[i];
			i++;
		}
		arr[arr.length-1] = 0;
	}
}

public class ArrayTestMain {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		ArrayTest.reverseArray(arr, 0, arr.length - 1);
		ArrayTest.printArray(arr);
		ArrayTest.rotate(arr);
		ArrayTest.printArray(arr);
		ArrayTest.shiftnArray(arr, 3);
		ArrayTest.printArray(arr);
		ArrayTest.insertArray(arr, 3, 5);
		ArrayTest.printArray(arr);
		ArrayTest.deleteArray(arr, 3);
		ArrayTest.printArray(arr);
	}
}
