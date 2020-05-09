public class Fiborec {

    int fibo(int i) {
        if (i==1) {
            return 1;
        } else if (i==2) {
            return 1;
        } else {
            int result = fibo(i-2) + fibo(i-1);
            return result;
        }

    }

    public static void main(String[] args) {
        Fiborec obj = new Fiborec();

		System.out.println("Calculating fibonacci running time...");
		for (int i=10; i<51; i+=10) {
			System.out.println(String.format("<%2d>", i));
            long start = System.currentTimeMillis();
            int temp = obj.fibo(i);
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println(diff);
		}
    }
}
