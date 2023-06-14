import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        List<Integer> distanceList = new ArrayList<>();
        
        for(int num : array){
            distanceList.add(Math.abs(num - n));
        }
        
        return array[IntStream.range(0, distanceList.size()).boxed().min(Comparator.comparingInt(distanceList::get)).orElseThrow()];
    }
}