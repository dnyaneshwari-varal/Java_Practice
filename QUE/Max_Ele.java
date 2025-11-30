package QUE;

public class Max_Ele {
    public static void main(String[] str) {
        int[] arr = { 12, 9, 64, 21, 8, 98 };
        int max = arr[0];

        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("max number in array is: " + max);
    }
}
