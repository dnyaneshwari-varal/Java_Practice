package QUE;

import java.util.Arrays;
import java.util.List;

public class even_odd_count_InList {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,2,3,5,8,12);
        // List<Integer> list = Arrays.asList(10, 5, 7, 8, 13, 22);
        
        int even=0;
        int odd=0;

        for(int num:list){
            if(num%2==0)
                even++;
            else
                odd++;
        }

        System.out.println("count of even: "+even);
        System.out.println("count of odd: "+odd);

    }
}
