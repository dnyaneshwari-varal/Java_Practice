package Functions;

public class swapping_num {
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a +" vb: "+b);
    }

    public static void main(String []args){
        int a=10;
        int b=12;
        swap(a,b);
        
    }
    
}
