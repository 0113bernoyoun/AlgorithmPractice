import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new LinkedHashSet<>();
        int currentValue = n;
        for(int i = 2; i < n; i++){
            while(true){
                if(currentValue % i == 0){
                    currentValue = currentValue / i;
                    set.add(i);
                } else {
                    break;
                }
            }
        }
        
        if(set.isEmpty()){
            set.add(n);
        }
      
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}