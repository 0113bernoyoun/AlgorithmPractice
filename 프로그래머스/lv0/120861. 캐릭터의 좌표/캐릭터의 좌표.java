class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int boardMaxWidth = board[0] / 2;
        int boardMaxHeight = board[1] / 2;
        int boardMinWidth = -1 * boardMaxWidth;
        int boardMinHeight = -1 * boardMaxHeight;
        int curX = 0;
        int curY = 0;
        
        for(String s : keyinput){
            if(s.equals("left")){
                if(curX - 1 >= boardMinWidth){
                    curX--;
                }
            } else if(s.equals("right")){
                if(curX + 1 <= boardMaxWidth){
                    curX++;
                }
            } else if(s.equals("down")){
                if(curY - 1 >= boardMinHeight){
                    curY--;
                }
            } else if(s.equals("up")){
                if(curY + 1 <= boardMaxHeight){
                    curY++;
                }
            } else{
                
            }
        }
        
        int[] answer = {curX, curY};
        return answer;
    }
}