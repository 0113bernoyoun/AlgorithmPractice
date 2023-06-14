import java.util.*;

class Solution {
    public int solution(int n) {
        
        if(n < 4){
            return 0;
        }
        
        int answer = 0;
        
        Set<Integer> answerSet = new HashSet<>();
        for(int j = 4; j <= n; j++){
            for(int i = 1; i < j / 2 + 2; i++){
                if(j % i == 0){
                 answerSet.add(i);
                 answerSet.add(j / i);
                }   
            }
            if(answerSet.size() >= 3){
                answer++;
                answerSet = new HashSet<>();
            }
        }
 
        return answer;
    }
}