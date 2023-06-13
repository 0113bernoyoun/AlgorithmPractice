import java.util.*;
import java.util.stream.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        List<int[]> answerList = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();
        int cnt = 1;
        
        for(int i = 0; i < num_list.length; i++){
            tmpList.add(num_list[i]);
            cnt++;
            if(cnt - 1 == n){
                answerList.add(tmpList.stream().mapToInt(Integer::intValue).toArray());
                tmpList = new ArrayList<>();
                cnt = 1;
            }
        }
        
        return answerList.stream().toArray(int[][]::new);
    }
}