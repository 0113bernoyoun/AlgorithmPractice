class Solution {
    public int solution(int n) {
        return getLCM(Math.max(6,n), Math.min(6,n)) / 6;
    }
    
    private int getGCD(int a, int b){
        while(b > 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        
        return a;
    }
    
    private int getLCM(int a, int b){
        return a * b / getGCD(a, b);
    }
}