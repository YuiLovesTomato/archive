package pk0610;

public class Ex2 {
    public static void main(String[] args) {
        int num=3;

        for (int i=0; i<6; i++) {
            num += 7-i;
            System.out.print(i + "행의 내용: ");
            for (int j=0; j<7-i; j++) {
                System.out.print("   ");
            }
            int temp = num;
            int n = 5
            for (int j=0; j<=i; j++) {
                System.out.print(num + " ");
                num -= n;
		n -= 1;
            }
            num = temp;

            System.out.println();
        }
    }
}
