class Solution {
    public int solution(int[][] board) {
        int safeArea = 0;

        
        int curX = -1;
        int curY = -1;
        
        int bombArea = 2;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    if(i - 1 >= 0){
                        if(board[i - 1][j] == 0){
                            board[i - 1][j] = bombArea;
                        }
                        if(j - 1 >= 0 && board[i - 1][j - 1] == 0){
                            board[i - 1][j - 1] = bombArea;
                        }
                        
                        if(j + 1 < board[i].length && board[i - 1][j + 1] == 0){
                            board[i - 1][j + 1] = bombArea;
                        }
                    }
                    
                    if(j - 1 >= 0 && board[i][j - 1] == 0){
                        board[i][j - 1] = bombArea;
                    }
                    
                    if(j + 1 < board[i].length && board[i][j + 1] == 0){
                        board[i][j + 1] = bombArea;
                    }
                    
                    
                    if(i + 1 < board[i].length){
                        if(board[i + 1][j] == 0){
                        board[i + 1][j] = bombArea;
                        }
                        if(j + 1 < board[i].length && board[i + 1][j + 1] == 0){
                            board[i + 1][j + 1] = bombArea;
                        }
                        
                        if(j - 1 >= 0 && board[i + 1][j - 1] == 0){
                            board[i + 1][j - 1] = bombArea;
                        }
                    }
                }
            }
        }
        
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[i].length; j++){
                    if(board[i][j] == 0){
                        safeArea++;
                    }
                }
        }

        return safeArea;
    }
}