package lab3;

public class SumRec {
	int sum=0;
	int sum(int n) {
		if (n<0)
			return -1;

		if (n==1) {
			sum+=1;
		} else {
			sum+=n;
			sum(n-1);
		}
		return sum;
	}

	public static void main(String[] args) {
		SumRec obj = new SumRec();

		int result = obj.sum(10);
		System.out.println(result);
	}
}
