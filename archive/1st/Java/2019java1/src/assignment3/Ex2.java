package assignment3;

public class Ex2 {
    public static void main(String[] args) {
        int[] temp = {0,1,2,3,4};
        int[] sale = {50000,5000,35000,20000,15000};
        int[] wage = {7000,250,3500,1400,1050};
        String[] seller = {"강된장", "허수당", "최소주", "박대장", "김팔자"};

        int[] twage = {7000,250,3500,1400,1050};        //  == temp wage

        //배열은 멤버 변수로 다루는 법을 모르겠음

        for (int i=0; i<wage.length; i++) {
            for (int j=0; j<wage.length-i-1; j++) {
                if (twage[j] > twage[j+1]) {
                    int tt = twage[j];
                    twage[j]=twage[j+1];
                    twage[j+1]=tt;

                    // aligning temp for printing
                    int ttt = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = ttt;
                }
            }
        }

        for (int i=0; i<wage.length; i++) {
            System.out.print(i+1 + " ");
            System.out.print(sale[temp[i]] + " ");
            System.out.print(wage[temp[i]] + " ");
            System.out.print(seller[temp[i]]);
            System.out.println();
        }

        System.out.println();

        for (int i=0; i<wage.length; i++) {
            System.out.print(i+1 + " ");
            System.out.print(seller[temp[i]] + " ");
            for (int j=0; j<sale[temp[i]]/1000; j++) {
                System.out.print("■");
            }
            System.out.print(" (" + sale[temp[i]] + ")");
            System.out.println();
        }
    }
}
