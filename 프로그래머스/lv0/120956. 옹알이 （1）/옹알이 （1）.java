class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canSound = {"aya", "ye", "woo", "ma"};
        
        for(String babb : babbling){
            for(String sound : canSound){
                babb = babb.replaceAll(sound, " ");
            }
            babb = babb.replaceAll(" ", "");
            if(babb.isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}