class brute{
        public static int[] brute(int a[]){
        int n=a.length;
        int repeating=-1,missing=-1;
        for(int i=1;i<=n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(a[j]==i)c++;
            }
            if(c==2) repeating=i;
            else if(c==0) missing=i;
            if(repeating !=-1 && missing!=-1) break;
        }
        return new int[]{repeating,missing};
    }
}
class better{
    public static int[] better(int a[]){
        int n=a.length;
        int repeating=-1,missing=-1;
        int hash[]=new int[n+1];
        for(int i=0;i<n;i++){
            hash[a[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==2) repeating=i;
            else if(hash[i]==0) missing=i;
            if(repeating!=-1 && missing!=-1) break;
        }
        return new  int[]{repeating,missing};
    }
}
class optimal1{
        //T.C.:O[n] S.C:O[1]
    //for large data sets take sum as long
    public static int[] optimal1(int a[]){
        int n=a.length;
        // int x=-1,y=-1;
        //s-sumN1=x-y=val1
        // s-sumN2=val2
        //val2/val1=x+y

        int sumN1=(n*(n+1))/2;
        int sumN2=(n*(n+1)*(2*n+1))/6;
        int s1=0,s2=0;
        for(int i=0;i<n;i++){
            s1+=a[i];
            s2+=a[i]*a[i];
        }
        int val1=s1-sumN1;
        int val2=s2-sumN2;
        val2=val2/val1;
        int x=(val1+val2)/2;
        int y=x-val1;
        return new int[]{x,y};
    }
}
public class repeating_Missing{
    
    public static void main(String args[]){
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = optimal1.optimal1(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans[0] + ", " + ans[1] + "}");

    }
}