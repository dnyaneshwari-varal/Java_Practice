package constructor;

public class parameterized_Cons {
    String name;
    parameterized_Cons(String n){
        name=n;
        System.out.println(n);
    }

    public static void main(String[] args) {
        parameterized_Cons obj= new parameterized_Cons("VARAL");
    }
}
