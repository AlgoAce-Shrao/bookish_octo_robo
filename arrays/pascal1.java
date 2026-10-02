//progrsam to print the pascal's triangle-->but this program has 3 variations

//1.  !st variation-->given the row number and the column number ,print the element at that particular index in the pattern
 class func_NcR{
    public static long func_NcR(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res*=(n-i);
            res=res/(i+1);
        }
        return res;

    }
}

//2. Given the row number...print the entire row in the pattern
class printRow{
    public static void printRow(int n){
        for(int c=0;c<n;c++){
            System.out.print(func_NcR.func_NcR(n-1, c)+ " ");
        }

    }
}

//3. Given the number of rows..print the pattern upto that row number
class pattern{
    public static void pat(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(func_NcR.func_NcR(i-1, j)+" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class pascal1{
    public static void main(String args[]){
        //int row=6,col=3;-->for 1st qstn
        // System.out.println(func_NcR.func_NcR(row-1, col-1)); //-->for 1. qstn
        
        //for qstn 2
        // printRow.printRow(row);

        int row=6;
        pattern.pat(row);
    }
}