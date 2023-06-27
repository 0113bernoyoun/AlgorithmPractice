import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] emergency) {        
        List<Integer> emergencyList = Arrays.stream(emergency).boxed().sorted().collect(Collectors.toList());
        Collections.reverse(emergencyList);
        Map<Integer, Integer> patientMap = new HashMap<>();
        
        Integer patientCounter = 1;
        for(Integer i : emergencyList){
            patientMap.put(Integer.valueOf(i), patientCounter);
            patientCounter++;
        }
        
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < emergency.length; i++){
            resultList.add(patientMap.get(Integer.valueOf(emergency[i])));
        }
        
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
    

}