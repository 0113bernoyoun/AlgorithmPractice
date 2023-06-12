import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> answerSet = new HashSet<>();
        for(int i = 1; i < n / 2 + 2; i++){
            if(n % i == 0){
                answerSet.add(i);
                answerSet.add(n / i);
            }
        }
        return answerSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}