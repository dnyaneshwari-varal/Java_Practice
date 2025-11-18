package Functions;
import java.util.Scanner;

public class with_parameter {
    public static int add(int a,int b){ //parameters or formal parameters

        int add=a+b;
        return add;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int add=add(a,b); //arguments (actual parameter)
        System.out.println("Sum of a and b "+ a + " +"+ b +" is "+ add);
    }
}
