public class eightQueen{
    public static void placeQueen(int [][]board,int remQueen){
        if(remQueen==0) {
            printBoard(board);
            System.exit(0);
        }
        for(int j=0;j<=7;j++){
            if(available(board,remQueen-1,j)){
                board[remQueen-1][j]=1;
                placeQueen(board,remQueen-1);
                board[remQueen-1][j]=0;
            }
        }
    }
    public static boolean available(int [][]board,int row,int col){
        //horizontal
        for(int j=0;j<=7;j++){
            if(board[row][j]==1){
                return false;
            }
        }
        //vertical
        for(int i=0;i<=7;i++){
            if(board[i][col]==1){
                return false;
            }
        }
        //upper left
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]==1){
                return false;
            }
        }
        // upper right
        r=row;
        for(int c=col;c<=7 && r>=0;c++,r--){
            if(board[r][c]==1){
                return false;
            }
        }
        //lower left
        r=row;
        for(int c=col;c>=0 && r<=7;c--,r++){
            if(board[r][c]==1){
                return false;
            }
        }
        //lower right
        r=row;
        for(int c=col;c<=7 && r<=7;c++,r++){
            if(board[r][c]==1){
                return false;
            }
        }
        return true;
    }
    public static void printBoard(int [][]board){
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int [][]board =new int[8][8];
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7;j++){
                board[i][j]=0;
            }
        }
        placeQueen(board,8);
    }
}
