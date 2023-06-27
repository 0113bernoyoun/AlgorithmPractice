class Solution {
    public int solution(int n) {
        int count = 1;
        for(int i = 1; i < 11; i++){
            count = count * i;
            if(count == n){
                return i;   
            }
            
            if(count > n){
                return i - 1;
            }
        }
        return -1;
    }
}