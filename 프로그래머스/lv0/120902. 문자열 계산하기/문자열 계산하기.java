import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String operator = "+";
        String[] splitedString = my_string.split(" ");
        for(String s : splitedString){
           if(s.equals("+") || s.equals("-")){
               operator = s;
           } else {
               if(operator.equals("+")){
                   answer += Integer.parseInt(s);
               } else {
                   answer-= Integer.parseInt(s);
               }
               
               operator = "+";
           }
        }
        return answer;
    }
}