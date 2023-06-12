import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        
     Deque<Integer> numberQueue = new ArrayDeque<>(Arrays.stream(numbers).boxed().collect(Collectors.toList()));
        
     
        
        if(direction.equals("right")){
            numberQueue.addFirst(numberQueue.removeLast());
        } else{
           numberQueue.addLast(numberQueue.removeFirst());
        }
        
        
        
        
        return numberQueue.stream().mapToInt(Integer::intValue).toArray();
    }
}