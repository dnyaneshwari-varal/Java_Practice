package Functions;

public class factorial {
    public static int factorial(int fact){
        for(int i=fact-1;i>=1;i--){
            fact=fact*i;
        }
        return fact;

    }
    public static void main(String[] args) {
        int fact=12;
        int result=factorial(fact);
        System.out.println(result);
    }
}
