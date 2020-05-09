package assignment3;

import java.util.Scanner;

public class Ex1 {
    Scanner scan = new Scanner(System.in);
    int a=8 ,b=2;
    int result = -1;

    public int processResult() {
        System.out.print(a + " & " + b + ", operator: ");
        String str = scan.next();

        if (str.equals("*")) {
            result = a*b;
        } else if(str.equals("+")){
            result = a+b;
        } else if(str.equals("-")){
            result = a-b;
        } else if(str.equals("/")){
            result = a/b;
        } else if(str.equals("%")){
            result = a%b;
        }

        return result;
    }
    public static void main(String[] args) {
        Ex1 obj = new Ex1();

        System.out.print(obj.processResult());

    }
}
