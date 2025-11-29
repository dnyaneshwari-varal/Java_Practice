package constructor;

public class Copy_Cons {

    int roll_no;
    String name;

    Copy_Cons(int r, String n) {
        roll_no = r;
        name = n;

    }

    Copy_Cons(Copy_Cons obj2) {
        this.name = obj2.name;
    }

    public static void main(String[] args) {
        Copy_Cons obj1 = new Copy_Cons(12, "Shivani");
        Copy_Cons obj2 = new Copy_Cons(obj1);
        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}
