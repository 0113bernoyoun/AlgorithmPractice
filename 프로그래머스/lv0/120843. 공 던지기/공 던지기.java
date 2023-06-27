class Solution {
    public int solution(int[] numbers, int k) {
        int num = 1;
        int currentIdx = 0;
        while(num < k){
            if(currentIdx + 2 >= numbers.length){
               currentIdx = currentIdx + 2 - numbers.length;
            } else {
                currentIdx = currentIdx + 2;
            }
            
            System.out.println(currentIdx);
            num++;
        }
        
        return numbers[currentIdx];
    }
}