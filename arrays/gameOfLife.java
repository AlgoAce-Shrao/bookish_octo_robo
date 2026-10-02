class brute {
    public  static int[][] gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int c0=0,c1=0;
                for(int k=0;k<=i;k++){
                    for(int l=0;l<=j;l++){
                        if(board[k][l]==1) c1++;
                        // else c1++;
                    }
                }
                if(board[i][j]==0){
                    if(c1==3) board[i][j]=1;
                }
                else if(board[i][j]==1){
                    if(c1<2 || c1>3) board[i][j]=0;
                    else if(c1==2 ||c1==3 )  board[i][j]=1;
                }
            }
        }
        return board;
    }
}
public class gameOfLife {
    public static void main(String args[]){
        int arr[][]={{0,1,0} , {0,0,1},{1,1,1},{0,0,0}};
        brute.gameOfLife(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
}
