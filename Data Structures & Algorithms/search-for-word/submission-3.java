class Solution {
    public boolean find(char[][] board,int row,int col,int idx,String word,boolean[][] vis){
        if(row<0 || row>=board.length || col<0 || col>=board[0].length ){
            return false;
        }

        if(vis[row][col]){
            return false;
        }

        if(word.charAt(idx)!=board[row][col]){
            return false;
        }

        if(idx==word.length()-1){
            return true;
        }

        vis[row][col]=true;

        boolean ans= find(board,row+1,col,idx+1,word,vis) || find(board,row,col+1,idx+1,word,vis) ||
        find(board,row-1,col,idx+1,word,vis) ||
        find(board,row,col-1,idx+1,word,vis);

        vis[row][col]=false;
    return ans;
    }

    public boolean exist(char[][] board, String word) {
        char ch=word.charAt(0);
        boolean[][] vis=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==ch && find(board,i,j,0,word,vis)){
                    return true;
                }
            }
        }

        return false;
    }
}
