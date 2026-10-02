//return the missing number in a array
class brt{//T.C. -->O[n^2] S.C.-->O[1]
    public static int brt(int a[],int n){
        for(int i=1;i<=n;i++){
            int flag=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0) return i;
        }
        return -1;
    }
}
//Better approach-->Hashing
class better{
    public static int better(int a[],int n){
        //create a hash array to store the number of times each element occurs
        int hash[]=new int[n+1];
        for(int i=0;i<n-1;i++){
            hash[a[i]]=1;
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==0) return i;
        }
        //the following line will never execute..just to avoiid warnings
        return -1;
    }
}
class best1{
    public static int best1(int a[],int n){
        //sum approach
        int s1=0;
        int sum=0;
        sum=n*(n+1)/2;
        for(int i=0;i<n-1;i++){
            s1=s1+a[i];
        }
        return sum-s1;
    }
}
class optimal{
    public static int optimal(int a[],int n){
        //XOR approach
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2=xor2^a[i];
            xor1=xor1^(i+1);
        }
        xor1^=n;
        return (xor1^xor2);
    }
}
class miss{
    public static void main(String args[]){
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = optimal.optimal(a, N);
        System.out.println("The missing number is: " + ans);
    }
}