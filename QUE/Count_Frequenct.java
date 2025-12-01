package QUE;

public class Count_Frequenct {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 2 };

        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] == arr[j])
                    count++;

            }
            System.out.println("Frequency for " + arr[i] + "is: " + count);
        }

    }
}
