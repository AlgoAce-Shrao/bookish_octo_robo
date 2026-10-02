import java.util.ArrayList;
import java.util.List;
class printSpiral{
    public static List<Integer> printSpiral(int a[][]){
        List<Integer> ans=new ArrayList<>();
        int n=a.length;
        int m=a[0].length;
        int top=0,bottom=n-1;
        int left=0,right=m-1;


//             Time Complexity: O(m x n) { Since all the elements are being traversed once and there are total n x m elements ( m elements in each row and total n rows) so the time complexity will be O(n x m)}.

// Space Complexity: O(n) { Extra Space used for storing traversal in the ans array }.


         // Loop until all elements are not traversed.
        while(top<=bottom && left<=right){

                 // For moving left to right
            for(int i=left;i<=right;i++){
                ans.add(a[top][i]);
            }
            top++;

            // For moving top to bottom.
            for(int i=top;i<=bottom;i++){
                ans.add(a[i][right]);
            }
            right--;
            // For moving right to left.
            if(top<=bottom){

                for(int i=right;i>=left;i--){
                    ans.add(a[bottom][i]);
                }
            }
            bottom--;
             // For moving bottom to top.
            if(left<=right){

                for(int i=bottom;i>=top;i--){
                    ans.add(a[i][left]);
                }
            }
            left++;
        }
        return ans;
    }
}
class spiral{
    public static void main(String[] args) {
        
        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        List<Integer> ans = printSpiral.printSpiral(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}