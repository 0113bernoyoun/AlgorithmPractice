import java.util.*;
import java.util.stream.*;

class Solution {
    
    Map<String,String> m = new HashMap<>();
    
    public String solution(String letter) {
        initMap();
        String answer = "";
        String[] splitedLetter = letter.split(" ");
        
        for(String s : splitedLetter){
            answer += m.get(s);
        }
        
        
        return answer;
    }
    
    private void initMap(){
        m.put(".-","a");m.put("-...","b");m.put("-.-.","c");m.put("-..","d");m.put(".","e");m.put("..-.","f");m.put("--.","g");m.put("....","h");m.put("..","i");m.put(".---","j");m.put("-.-","k");m.put(".-..","l");m.put("--","m");m.put("-.","n");m.put("---","o");m.put(".--.","p");m.put("--.-","q");m.put(".-.","r");m.put("...","s");m.put("-","t");m.put("..-","u");m.put("...-","v");m.put(".--","w");m.put("-..-","x");m.put("-.--","y");m.put("--..","z");
    }
}