package QUE;

public class Reverse_String {
    public static void main(String [] args){
        String str="VARAL";
        String str2="";

        for(int i=str.length()-1; i>=0; i--){
            str2=str2+str.charAt(i);
        }
        System.out.println("Reverse String Is: "+str2);

    }
}
