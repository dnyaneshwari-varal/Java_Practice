// package constructor;

public class Default_constructor {
    String name;
    int age;

    Default_constructor() {
        name = "Dnyaneshwari";
        age = 21;
        System.out.println(name +" "+ age);
        System.out.println("In default_constructor");
    }

    public static void main(String[] args) {
        Default_constructor obj = new Default_constructor();

    }

}
