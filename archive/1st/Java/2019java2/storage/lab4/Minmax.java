import java.util.Scanner;

public class Minmax {

    int max(int[] list) {
        int max = Integer.MIN_VALUE;
        int number;
        for (int i=0; i<list.length; i++) {
            number = list[i];
            if (max < number) {
                max = number;
            }
        }

        return max;
    }

    int min(int[] list) {
        int min = Integer.MAX_VALUE;
        int number;
        for (int i=0; i<list.length; i++) {
            number = list[i];
            if (min > number) {
                min = number;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Minmax obj = new Minmax();

        //variable initializing
        int[] a = new int[10];
        int sum=0;
        int avg;
        int min;
        int max;

        //scan & add to sum & list assigning
        for (int i=0; i<10; i++) {
            System.out.print(String.format("insert a[%d]: ", i));
            a[i] = scan.nextInt();
            sum += a[i];
        }
        avg = sum/10;
        max = obj.max(a);
        min = obj.min(a);

        System.out.println(String.format("sum: %d", sum));
        System.out.println(String.format("avg: %d", avg));
        System.out.println(String.format("max: %d", max));
        System.out.println(String.format("min: %d", min));
    }

}