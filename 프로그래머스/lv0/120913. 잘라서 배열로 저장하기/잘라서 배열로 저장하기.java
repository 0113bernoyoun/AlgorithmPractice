import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String my_str, int n) {
        
        List<String> answerList = new ArrayList<>();
        int cutNum = my_str.length() % n > 0 ? my_str.length() / n + 1 : my_str.length();
        int cutEndPoint = n;
        int cutStartPoint = 0;
        for(int i = 0; i < cutNum; i++){
            answerList.add(my_str.substring(cutStartPoint, cutEndPoint));
            cutStartPoint = cutEndPoint;
            cutEndPoint = cutEndPoint + n ;
            if(cutEndPoint > my_str.length()){
                if(!my_str.substring(cutStartPoint).isEmpty()){
                answerList.add(my_str.substring(cutStartPoint));
                }
                break;
            } 
        }
        
        return answerList.stream().toArray(String[]::new);
    }
}