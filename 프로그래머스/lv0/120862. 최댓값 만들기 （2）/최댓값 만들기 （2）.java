import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int firstValue = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int secondValue = numbers[0] * numbers[1];
        
        return firstValue >= secondValue ? firstValue : secondValue;
    }
}