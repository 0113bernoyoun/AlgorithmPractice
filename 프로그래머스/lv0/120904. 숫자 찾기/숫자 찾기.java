import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int num, int k) {
        return Integer.toString(num).indexOf(Integer.toString(k)) >= 0 ? Integer.toString(num).indexOf(Integer.toString(k))  + 1 : Integer.toString(num).indexOf(Integer.toString(k)) ;
    }
}