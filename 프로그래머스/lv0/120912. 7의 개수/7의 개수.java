import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array) {
        
        return (int)Arrays.stream(Arrays.stream(array).boxed().map(i -> i.toString()).collect(Collectors.joining()).split("")).filter(s -> s.equals("7")).count();
    }
}