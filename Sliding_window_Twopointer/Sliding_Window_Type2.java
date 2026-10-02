//type 2:-->Longest subarray /substring of <condition>
//Qstn: --> Lonegeswt Subarray of sum<=k

//***Brute force-->Always generate all the subarrays
class brute{
    public static int brute(int a[],int k){
        int n=a.length;
        int maxLen=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                //***condition***
                //as in this case code is :
                s+=a[j];
                if(s<=k){
                    maxLen=Math.max(maxLen, j-i+1);
                }else{
                    break;   //Keep in mind to keep these kind of short optimizations...this is what increases the efficiency of the code in the long term
                }
            }
        }
        return maxLen;
    }
}
 //***Better Solution:-->Apply two pointers/sliding window
 /*
  * The window:
  * Expands on the right-->right pointer ++-->if the condition satisfies
  * Shrinks on the left-->left pointer++-->if the condition is not satisfied
  */

  class Better{  ///           ***optimal if the subarrays are needed to be printred
    public static int Better(int a[],int k){
        //T.C.:O[2n]|| S.C.:O[1]
        int n=a.length;
        int l=0,r=0,s=0; ///****only the sum initialization will vary acc to qstn else all same
        int maxLen=Integer.MIN_VALUE;
        while(r<n){//---?O[n]
            s+=a[r];
            //if condition dosn't meet,trim /shrink from the left
            while(l<=r && s>k){//--->O[n]
                s-=a[l];
                l++;
            }
            //if condition is met,find the maxLength (or anything acc to qstn)
            if(s<=k){
                maxLen=Math.max(maxLen,r-l+1);  //****store the l and r here if it is asked to print the subarray 
            }
            //and always increment right
            r++;
        }
        return maxLen;
    }
  }
class optimal{
    //T.C.:O[n]|| S.C.;O[1]
    public static int optimal(int a[],int k){
         int n=a.length;
        int l=0,r=0,s=0; ///****only the sum initialization will vary acc to qstn else all same
        int maxLen=Integer.MIN_VALUE;
        while(r<n){//---?O[n]
            s+=a[r];
            //if condition dosn't meet,trim /shrink from the left
            if(l<=r && s>k){//           ***do this only if the longest length is asked...but for printing the subarrays..go to the better solution
                s-=a[l];
                l++;
            }
            //if condition is met,find the maxLength (or anything acc to qstn)
            if(s<=k){
                maxLen=Math.max(maxLen,r-l+1);  //****store the l and r here if it is asked to print the subarray 
            }
            //and always increment right
            r++;
        }
        return maxLen;
    }
}

public class Sliding_Window_Type2{
    public static void main(String args[]){
        int arr[]={2,5,1,7,10};
        int k=14;
        int maximum=optimal.optimal(arr, k);
        System.out.println("Answer is:"+maximum);
    }
}