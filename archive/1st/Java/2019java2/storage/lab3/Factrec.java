public class Factrec {

    int factorial(int i) {
        int result;
        if (i==0) {
            result = 1;
        } else {
            result = i * factorial(i-1);
        }
        return result;
    }

    public static void main(String[] args) {
        Factrec obj = new Factrec();

        for (int i=0; i<11; i++) {
            long start = System.currentTimeMillis();
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println((i) + ": " + diff);
        }
    }
}
