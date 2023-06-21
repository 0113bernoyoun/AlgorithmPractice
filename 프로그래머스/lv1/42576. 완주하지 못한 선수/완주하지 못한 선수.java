import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        LinkedList<String> participantList = new LinkedList<>(Arrays.stream(participant).sorted().collect(Collectors.toList()));
        Arrays.sort(completion);
        for(int i = 0; i < completion.length; i++){
            participantList.remove(completion[i]);
        }
        return participantList.get(0);
    }
}