import java.util.*;
import java.util.stream.*;

public class Solution {
    public int[] solution(int []arr){
        List<Integer> answerList = new ArrayList<>();
        int currentValue = -1;
        for(int i = 0; i < arr.length; i++){
            if(currentValue != arr[i]){
                currentValue = arr[i];
                answerList.add(currentValue);
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}