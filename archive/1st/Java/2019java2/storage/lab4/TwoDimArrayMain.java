/**
 * 
 * @author Kim, Jin
 *
 */
class TwoDimArray {

	static void init1(int arr[][], int sNo) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sNo;
				sNo++;
			}
		}
	}

	static void init2(int arr[][], int sNo) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				arr[i][j] = sNo;
				sNo++;
			}
		}
	}

	static int[][] init3(int m, int n, int sNo) {
		int[][] arr = new int[m][n];
		int totalCell = m * n;
		int x = 0;

		while (x < totalCell) {
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = x + sNo;
						x++;
					}
				} else if (i % 2 == 1) {
					for (int j = arr[i].length - 1; j >= 0; j--) {
						arr[i][j] = x + sNo;
						x++;
					}
				}
			}
		}

		return arr;
	}

	/*
	only works in perfect square form.
	wasn't able to reach out to control variable n.
	 */
	static int[][] init4(int row, int col, int sNo) {
		int[][] arr = new int[row][col];
		int k=sNo-1;
		int sw=1;
		int i=0;
		int j=-1;
		int n=arr[0].length;


		do {
			for (int p=0; p<n; p++) {
				k++;
				j+=sw;
				arr[i][j] = k;
			}

			n--;


			if (n > 0) {
				for (int p=0; p<n; p++) {
					k++;
					i+=sw;
					arr[i][j] = k;
				}
				sw *= -1;
			} else {
				break;
			}
		} while(true);
		return arr;
	}

	static int[][] init5(int m, int n, int sNo) {
		int[][] arr = new int[m][n];
		int k = n-1;

		for (int i=0; i<arr.length; i++) {
		    for (int j=0; j<arr[i].length; j++) {
		    	if (j<k) {
		    		arr[i][j] = -1;
				} else {
		    		arr[i][j] = sNo;
					sNo++;
				}
			}
		    k--;
		}

		return arr;
	}

	static void printArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == -1) {		//if is added for init5
					System.out.print(" - ");
					continue;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}

public class TwoDimArrayMain {
	public static void main(String[] args) {
		int arr[][] = new int[4][10]; // 첨자들을 바꾸어 테스트해보라
		int startNumber = 10;

		TwoDimArray.init1(arr, startNumber);
		TwoDimArray.printArray(arr);
		TwoDimArray.init2(arr, startNumber);
		TwoDimArray.printArray(arr);
		int[][] init3 = TwoDimArray.init3(5,4, startNumber);
		TwoDimArray.printArray(init3);
		int[][] init4 = TwoDimArray.init4(6,6, startNumber);
		TwoDimArray.printArray(init4);
		int[][] init5 = TwoDimArray.init5(4,5, startNumber);
		TwoDimArray.printArray(init5);
	}
}
