class Solution {
    public int solution(int i, int j, int k) {
        String str = "";
        String keyChar = Integer.toString(k);
        for(int start = i; i <= j; i++){
            if(Integer.toString(i).contains(keyChar)){
                str += Integer.toString(i);
            }
        }
        
        return str.replaceAll("[^" + keyChar + "]", "").length();
    }
}