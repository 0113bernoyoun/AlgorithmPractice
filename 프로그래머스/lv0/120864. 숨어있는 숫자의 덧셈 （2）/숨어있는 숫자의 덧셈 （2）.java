import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String my_string) {
        int sum = 0;
        String tmpString = "";
        String[] strArray = my_string.split("");
        for(int i = 0; i < strArray.length; i++){
            if(!tmpString.isEmpty() && !Character.isDigit(strArray[i].charAt(0))){
                sum += Integer.parseInt(tmpString);
                tmpString = "";
            }
            
            if(Character.isDigit(strArray[i].charAt(0))){
                tmpString += strArray[i];
            }
        }
        
        if(!tmpString.isEmpty()){
            sum += Integer.parseInt(tmpString);
        }
        
        return sum;
    }
}