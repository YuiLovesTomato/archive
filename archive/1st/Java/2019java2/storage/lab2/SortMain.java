import java.util.Random;

class Sorting {
	
	public static void swap(int[] a, int j, int k) {
		int temp = a[j];
		a[j] = a[k];
		a[k] = temp;
	}

	public static void selectionSort(int[] a) {
		int i, j, min;
		for (i = 0; i < a.length - 1; i++) {
			for (j = i + 1, min = i; j < a.length; j++) {
				if (a[j] < a[min])
					min = j;
			}
			swap(a, min, i);
		}

	}
}

public class SortMain {
	private static final int MAX = 40000;
	private static int SIZE = 40000;

	public static void main(String[] args) {
		int a[] = new int[SIZE];
		Random r = new Random();

		for (int i = 0; i < SIZE; i++){
			a[i] = r.nextInt(MAX);
		}


		long start = System.currentTimeMillis();
		Sorting.selectionSort(a);
		long end = System.currentTimeMillis();
		System.out.println("selection time sort = " + (end - start));


	}
}
