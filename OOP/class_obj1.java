package OOP;

public class class_obj1 {
    public static void main(String[] args) {
        Pen p1=new Pen(); //created pen obj p1
        p1.setColor("black");
        p1.color="Pink";
        System.out.println(p1.color);


        //student obj
        Student s1=new Student();
        s1.setTotalMark(56, 78, 59);
        // System.out.println(s1.total);
    }
}


class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }
}

class Student{
    int name;
    int std;

    void setTotalMark(int chem,int bio,int maths){
        int total=chem+bio+maths;
        System.out.println(total);
    }
}