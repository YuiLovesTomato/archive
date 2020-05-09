package pk0610;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int[] li = new int[5];

       for (int i=0; i<li.length; i++) {
           System.out.print("Enter Int " + (i+1) + ": ");
           li[i] = scan.nextInt();
       }

       for (int i=0; i<li.length; i++) {
           for (int j=1; j<li.length; j++) {
               if (li[j] < li[j-1]) {
                   int temp = li[j];
                   li[j] = li[j-1];
                   li[j-1] = temp;
               }
           }
       }

       for (int i=0; i<li.length; i++) {
           System.out.print(li[i] + " ");
       }

       System.out.println("\nmax: " + li[4]);
       System.out.println("min: " + li[0]);

    }
}
