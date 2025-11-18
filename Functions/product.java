package Functions;

public class product {
    public static int multiply(int a, int b){
        int mul=a*b;
        return mul;

    }
    public static void main(String[] args) {
        int a=2;
        int b=5;
        int mul=multiply(a,b);
        System.out.println("a*b : "+mul);
    }
}
