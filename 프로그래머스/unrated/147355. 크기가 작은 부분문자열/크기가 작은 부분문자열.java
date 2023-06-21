import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String t, String p) {
        String[] tArray = t.split("");
        int answer = 0;
        for(int i = 0; i < tArray.length - p.length() + 1; i++){
            String numberStr = t.substring(i, i + p.length());
            if(Long.parseLong(numberStr) <= Long.parseLong(p)){
                answer++;
            }
        }
        
        return answer;
    }
}