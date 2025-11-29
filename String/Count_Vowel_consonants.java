public class Count_Vowel_consonants {
    public static void main(String[] args) {

        String str = "hello World";
        int v = 0;
        int c = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // System.out.println('a');
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
        }
        System.out.println("Count of Vowels: " + v);
        System.out.println("Count of Consonants: " + c);

    }
}
