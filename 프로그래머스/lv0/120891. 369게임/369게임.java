import java.util.*;
import java.util.stream.*;


class Solution {
    public int solution(int order) {
        return (int)Integer.toString(order).chars().filter(n -> n == '3' || n == '6' || n == '9').count();
    }
}