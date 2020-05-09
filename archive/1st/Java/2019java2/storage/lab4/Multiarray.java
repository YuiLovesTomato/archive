public class Multiarray {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        int i=0;
        int temp=1;
        int row=0;
        while (row<arr.length-1) {
            while (i<arr[row].length-1) {
                arr[row][i] = temp;
                i++;
                temp++;
            }
        i=0;
        row++;
        }
        printArray(arr);
    }
}

