package QUE;

public class Equal_Array {
    public static void main(String[] args) {
        int arr1[] = { 1, 4, 2, 2, 5 };
        int arr2[] = { 5, 4, 2, 2, 1 };
        int count = 0;
        if (arr1.length == arr2.length) {
            System.out.println("Array length is equal");

            for (int i = 0; i < arr1.length; i++) {

                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        count++;
                        arr2[j] = -1; // mark element as used
                        break;
                    }

                }
            }
            if (count == arr1.length) {
                System.out.println("Arrays elements are same");
            } else {
                System.out.println("Arrays elements are not same");
            }
        } else {
            System.out.println("Array length is not equal");
        }
    }
}
