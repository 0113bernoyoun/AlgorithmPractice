import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String before, String after) {
        String beforeSort = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
        String afterSort = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());
        return beforeSort.equals(afterSort) ? 1 : 0;
    }
}