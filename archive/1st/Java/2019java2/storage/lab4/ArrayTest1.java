package lab4;

public class ArrayTest1 {

	int[] shiftArray(int[] arr) {
		int temp = arr[arr.length-1];
		for (int i=arr.length-1; i>0; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		
		return arr;
	}

	public static void main(String[] args) {
		ArrayTest1 obj = new ArrayTest1();
		int[] a = {6,3,1,9,7,2};

		System.out.println("<a>");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		int[] b = obj.shiftArray(a);	//array a doesn't keep the same
		System.out.println("<b>");
		for (int i=0; i<a.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
	}
}
