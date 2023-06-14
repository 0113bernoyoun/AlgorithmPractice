import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] sList = s.split(" ");
        for(String target : sList){
            if(target.equals("Z")){
                stack.pop();
            } else{
                stack.push(Integer.parseInt(target));
            }
        }
        
        
        return (int)stack.stream().mapToInt(i -> i).sum();
    }
}