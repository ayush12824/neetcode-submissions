class Solution {
    public boolean isValid(char[][] board,int row,int col){
        for(int i=0;i<9;i++){
            if(i!=row){
                if(board[i][col]==board[row][col]){
                    return false;
                }
            }
        }

        for(int j=0;j<9;j++){
            if(j!=col){
                if(board[row][j]==board[row][col]){
                    return false;
                }
            }
        }

        int r=row/3;
        r=r*3;
        int c=col/3;
        c=c*3;

        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(i!=row && j!=col){
                    if(board[i][j]==board[row][col]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && !isValid(board,i,j)){
                    return false;
                }
            }
        }

        return true;
    }
}
