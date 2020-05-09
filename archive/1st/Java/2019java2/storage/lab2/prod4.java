public class prod4 {
	public static void main(String[] args) {
		long prod=2;
		int x=1;
		long start = System.currentTimeMillis();
		
		for (int n=1; n<=100000; n++) {
			for (int i=1; i<=n; i++) {
				prod = prod*prod;
			}
		}
		
		long end = System.currentTimeMillis();
		long diff = end-start;
		System.out.println(diff);
		
	}

}
