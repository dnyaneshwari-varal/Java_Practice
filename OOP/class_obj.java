
package OOP;

class class_obj {
    int id = 101;
    String name = "Dnyaneshwari";
    double salary = 12000;

    void work() {
        System.out.println("Manager");
    }

    public static void main(String[] args) {
        class_obj obj = new class_obj();
        System.out.println(obj.id);
        obj.work();
    }

}
