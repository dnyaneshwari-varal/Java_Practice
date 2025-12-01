package QUE;

public class Merge_Array {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 6, 7, 8, 9, 10 };
        int arr3[] = new int[arr1.length + arr2.length];

        for (int i = 0; i <= arr1.length - 1; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j <= arr2.length - 1; j++) {
            arr3[arr1.length + j] = arr2[j];
        }

        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }

}
