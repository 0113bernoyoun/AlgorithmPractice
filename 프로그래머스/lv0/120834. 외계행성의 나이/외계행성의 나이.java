import java.util.*;
import java.util.stream.*;

class Solution {
    
    private Map<Integer, String> matchMap = new HashMap<>();
    
    public String solution(int age) {
        initMap();
        return String.join("",Arrays.stream(Integer.toString(age).split("")).map(n -> matchMap.get(Integer.parseInt(n))).collect(Collectors.toList()));
    }
    
    private void initMap(){
        matchMap.put(0, "a");
        matchMap.put(1, "b");
        matchMap.put(2, "c");
        matchMap.put(3, "d");
        matchMap.put(4, "e");
        matchMap.put(5, "f");
        matchMap.put(6, "g");
        matchMap.put(7, "h");
        matchMap.put(8, "i");
        matchMap.put(9, "j");
    }
}