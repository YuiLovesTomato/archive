public class SumTotal {
	void sum1() {
			try {
				long start = System.currentTimeMillis();
				long sum=0;
				long n=100;
				System.out.println("<sum1>");
				
				for (int t=1; t<=10; t++) {
					for (long i=1; i<=n; i++) {
						sum+=i;
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
	void sum2() {
		try {
			long start = System.currentTimeMillis();
			long sum=0;
			long n=100;
			System.out.println("<sum2>");
			
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
	void sum3() {
		try {
			long start = System.currentTimeMillis();
			long sum=0;
			long n = 100;
			System.out.println("<sum3>");
	
			for (int t=1; t<=10; t++) {
				for (long i=1; i<=n; i++) {
					for (long j=1; j<=n; j++) {
						sum+=1;
						for (long k=1; k<=n; k++) {
							sum+=0;
							}
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
	public static void main(String[] args) {
		SumTotal obj = new SumTotal();
		obj.sum1();
		obj.sum2();
		obj.sum3();
	}
}
