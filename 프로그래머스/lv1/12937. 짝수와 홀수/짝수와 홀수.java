class Solution {
    private final String ODD = "Odd";
    private final String EVEN = "Even";
    
    public String solution(int num) {
        if(num % 2 == 0){
            return EVEN;
        } else {
            return ODD;
        }
    }
}