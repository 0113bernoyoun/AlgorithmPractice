import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        // int answer = 0;    
//         for(int i = 0; i <= n; i++){
//             if(i == 0){
//                 continue;
//             }
            
//             if(i % 2 == 0){
//                 answer += i;    
//             }
//         }
//         return answer;
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).sum();    
    }
}