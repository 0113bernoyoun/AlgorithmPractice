import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split("")).sorted().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).sorted().collect(Collectors.joining());
    }
}