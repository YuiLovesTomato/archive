public class Factiter {
    public static void main(String[] args) {
        int[] list = new int[11];

        list[1]=1;
        for (int i=1; i<11; i++) {
            long start = System.currentTimeMillis();
            int temp=1;
            for (int j=1; j<=i; j++) {
                temp *= j;
            }
            list[i] = temp;
            long end = System.currentTimeMillis();
			long diff = end - start;
            System.out.println((i) + ": " + diff);
        }
    }
}
