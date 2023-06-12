import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        
      return new LinkedHashSet<String>(Arrays.asList(my_string.split(""))).stream().collect(Collectors.joining());
    }
}