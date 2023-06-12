import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String my_string) {
        //sol 2
        return Arrays.stream(my_string.split("")).filter(s -> Character.isDigit(s.charAt(0))).mapToInt(Integer::parseInt).sum();
        

// sol2
//         for(int i = 0; i < my_string.length(); i++){
//             if(Character.isDigit(my_string.charAt(i))){
//                 answer += Character.getNumericValue(my_string.charAt(i));
//             }
//         }
    }
}