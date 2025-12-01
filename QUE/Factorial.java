package QUE;

public class Factorial {
    public static void main(String[] args) {
        int num=5; //5!=120
        int fact=1;
        for(int i=num;i>0;i--){
             fact=fact*i;
        }
        System.out.println("Factorial of "+num +" is "+fact);
    }
}
//Factorial of 5 is 120