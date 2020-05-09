public class TwoSmallest {

    static void findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println(max);
    }

    static void findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (max<arr[i]) {
                secondMax = max;
                max=arr[i];
            } else if (secondMax<arr[i]) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }

    public static void main(String[] args) {
        int[] arrA = {8,9,5,3,41,6,0,7,1,2};
        findMax(arrA);
        findSecondMax(arrA);
    }
}
