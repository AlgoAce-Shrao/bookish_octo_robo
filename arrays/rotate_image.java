
class brute {
    // T. C.: O[n^2] || S.C.:O[n^2]
    public static int[][] brute(int a[][]) {
        int ans[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                ans[j][a.length - 1 - i] = a[i][j];

            }
        }
        return a;
    }
}

class optimal {
    public static int[][] optimal(int a[][]) {
        //find the transpose 
        int n=a.length;
        for(int  i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }


        //reverse every row-->simple swap
        for(int i=0;i<n;i++){
            int p1=0,p2=n-1;
            while(p1<p2){
                int  t=0;
                t=a[i][p1];
                a[i][p1]=a[i][p2];
                a[i][p2]=t;
                p1++;
                p2--;
            }
        }
        return a;
    }
}

public class rotate_image {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int rotated[][] = optimal.optimal(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}
