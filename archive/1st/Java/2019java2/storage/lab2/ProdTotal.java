public class ProdTotal {
	void prod1() {
		long prod=1;
		int x=2;
		long start = System.currentTimeMillis();
		System.out.println("<prod1>");
		
		for (int n=1; n<=100000; n*=2) {
			for (int i=1; i<=n; i++) {
				prod = prod*x;
			}
		}
		
		long end = System.currentTimeMillis();
		long diff = end-start;
		System.out.println(diff);
	}
	void prod3() {
		long prod=1;
		int x=1;
		long start = System.currentTimeMillis();
		System.out.println("<prod3>");
		
		for (int n=1; n<=100000; n*=2) {
			for (int i=1; i<=n; i++) {
				prod = prod*x;
			}
		}
		
		long end = System.currentTimeMillis();
		long diff = end-start;
		System.out.println(diff);
	}
	void prod2() {
		long prod=2;
		int x=2;
		long start = System.currentTimeMillis();
		System.out.println("<prod2>");
		
		for (int n=1; n<=100000; n++) {
			for (int i=1; i<=n; i++) {
				prod = prod*prod;
			}
		}
		
		long end = System.currentTimeMillis();
		long diff = end-start;
		System.out.println(diff);
	}
	void prod4() {
		long prod=2;
		int x=1;
		long start = System.currentTimeMillis();
		System.out.println("<prod4>");
		
		for (int n=1; n<=100000; n++) {
			for (int i=1; i<=n; i++) {
				prod = prod*prod;
			}
		}
		
		long end = System.currentTimeMillis();
		long diff = end-start;
		System.out.println(diff);
	}
	public static void main(String[] args) {
		ProdTotal obj = new ProdTotal();
		obj.prod1();
		obj.prod3();
		obj.prod2();
		obj.prod4();
	}
}
