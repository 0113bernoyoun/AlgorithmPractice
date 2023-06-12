class Solution {
    public int solution(int hp) {
        int answer = 0;
        int remain = hp;
        int[] atks = {5,3,1};
        
        for(int i = 0; i < atks.length; i++){
            if(hp >= atks[i]){
                answer += remain / atks[i];
                remain = remain % atks[i];
            } else {
                continue;
            }
        }
                
        return answer;
    }
}