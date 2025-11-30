public class parent {
    int x=40;
    parent() {
        System.out.println("In parent constructor");
        System.out.println(this);
    }
}

class child extends parent {
    
    int x=20;
    child() {
        System.out.println("In child constructor");
        System.out.println(this);
    }
    child(int x){
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x); //present in parent class
    }
}

class client {
    public static void main(String[] args) {
        child obj = new child(10);
        System.out.println("end main");
        
    }

}