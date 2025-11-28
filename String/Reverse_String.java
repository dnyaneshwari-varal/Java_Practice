
public class Reverse_String {

    public static String  reverse(String str,String rev){
            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            return rev;
    }
    public static void main(String[] args) {
        String str = "varal";
        String rev = "";


        String result=reverse(str,rev);

        // for (int i = str.length() - 1; i >= 0; i--) {
        //     rev = rev + str.charAt(i);
        // }
        System.out.println(result);
    }
}
