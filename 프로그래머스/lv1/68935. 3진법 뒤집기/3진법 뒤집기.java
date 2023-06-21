import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        List<String> ansString = Arrays.stream(Integer.toString(n, 3).split("")).collect(Collectors.toList());
        Collections.reverse(ansString);
        return Integer.parseInt(ansString.stream().collect(Collectors.joining()), 3);
    }
}