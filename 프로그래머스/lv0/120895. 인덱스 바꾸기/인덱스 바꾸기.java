import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] splitedString = my_string.split("");
        String tmp = splitedString[num1];
        splitedString[num1] = splitedString[num2];
        splitedString[num2] = tmp;
        return String.join("", splitedString);
    }
}