public class WordSearch {
    public boolean exist(char[][] board, String word) {
       int n=board.length;
       int m=board[0].length;
       for(int row=0;row<n;row++){
        for(int col=0;col<m;col++){
            if(move(board,word,row,col,0)){
               return true;
            }
        }
       } 
       return false;
    }
    public boolean move(char[][] board, String word, int row, int col, int idx){
        if(idx==word.length()){
            return true;
        }
        if(row<0 || col<0 || row>=board.length || col>=board[0].length
        ||  board[row][col] != word.charAt(idx)){
            return false;
        }
        char temp=board[row][col];
        board[row][col]='#';
        boolean found=move(board,word, row+1,col,idx+1)||move(board,word, row-1,col,idx+1)|| move(board,word,row,col+1,idx+1)|| move(board,word,row,col-1,idx+1);
        board[row][col]=temp;
        return found;
    }
}
