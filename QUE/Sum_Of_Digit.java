package QUE;

public class Sum_Of_Digit {
    public static void main(String[] args) {
        int num = 1234;

        int temp = 1234;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            // System.out.println(rem);
            sum = sum + rem;
            temp /= 10;

        }
        System.out.println("Sum of " + num + " is: " + sum);
    }
}
