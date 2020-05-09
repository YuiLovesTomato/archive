public class prod1 {
	public static void main(String[] args) {
		long prod=1;
		int x=2;
		long start = System.currentTimeMillis();
		
		for (int n=1; n<=32; n*=2) {
			for (int i=1; i<=n; i++) {
				prod = prod*x;
			}
		}
		
		long end = System.currentTimeMillis();
		long diff = end-start;
		System.out.println(diff);
		
	}

}
