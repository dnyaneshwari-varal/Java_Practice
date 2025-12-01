package QUE;

public class Reverse_Array {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        int arr2[] = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;
        }
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
