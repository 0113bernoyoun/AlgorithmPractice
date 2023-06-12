import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).map(s -> String.valueOf(Character.toLowerCase(s.charAt(0)))).sorted().collect(Collectors.joining());
    }
}