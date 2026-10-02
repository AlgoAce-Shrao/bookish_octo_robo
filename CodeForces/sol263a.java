import java.util.*;

/*
    if in question only number of swaps is asked...no need to do the swaps and count the swaps..just
    Math.abs(row-2)+Math.abs(col-2);

    If we wan t to modify the matrx then this solution is optimal



 */
public class sol263a{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[5][5];
        int row=0, col=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==1){
                    row=i;
                    col=j;
                }
            }
        }
        // System.out.println(row+ " "+ col);
        int kCol=0,kRow=0,c=0;
        if(col>2){
            kCol=col-2;
            for(int i=1;i<=kCol;i++){
                int temp=a[row][col-i];
                a[row][col-i]=a[row][col-i+1];
                a[row][col-i+1]=temp;
                c++;
            }
        }else{
            kCol=2-col;
            for(int i=1;i<=kCol;i++){
                int temp=a[row][col+i];
                a[row][col+i]=a[row][col];
                a[row][col]=temp;
                c++;
            }
        }
        if(row>2){
            kRow=row-2;
            for(int i=1;i<=kRow;i++){
                int temp=a[row-i][2];
                a[row-i][2]=a[row-i+1][2];
                a[row-i+1][2]=temp;
                c++;
            }       
         }else{
            kRow=2-row;
            for(int i=1;i<=kRow;i++){
                int temp=a[row+i][2];
                a[row+i][2]=a[row+i-1][2];
                a[row+i-1][2]=temp;
                c++;
            }  
         }
         System.out.println(c);

        

    }
}