public class sum2 {
	
	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();
			long sum=0;
			long n=100;
			
			for (int t=1; t<=10; t++) {
				for (long i=1; i<=n; i++) {
					for (long j=1; j<=n; j++) {
						sum+=1;
						}
					}
				long end = System.currentTimeMillis();
				long diff = end - start;
				System.out.println(diff);
				n+=100;
			}
			
		} catch (Exception e) {
			System.out.println("An exception occurs");
		}
	}
}