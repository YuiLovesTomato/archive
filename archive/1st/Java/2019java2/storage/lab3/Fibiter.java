public class Fibiter {

    public static void main(String[] args) {
        int[] list = new int[100];
        list[0] =  1;
        list[1] =  1;

		System.out.println("Calculating fibonacci running time...");
		for (int n=10; n<51; n+=10) {
			System.out.println(String.format("<%02d>", n));
        	long start = System.currentTimeMillis();
        	for (int i=2; i<n; i++) {
           		 list[i] = list[i-2]+list[i-1];
        	}
        	long end = System.currentTimeMillis();
        	long diff = (end - start)/1000;
        	System.out.println(diff);   //0 on [10,1000]
		}
    }
}
