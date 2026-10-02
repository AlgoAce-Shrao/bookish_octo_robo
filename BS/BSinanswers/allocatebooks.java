public class allocatebooks {
    public static int max(int a[],int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max) max=a[i];
        }
        return max;
    }
    public static int sum(int a[],int n){
        int s=0;
        for(int i=0;i<n;i++){
            s+=a[i];
        }
        return s;
    }
    public static  int cntStu(int a[],int pages){
        int stu=1,pagesStu=0;
        for(int i=0;i<a.length;i++){
            if(pagesStu+a[i]<=pages) pagesStu+=a[i];
            else {
                stu++;
                pagesStu=a[i];
            }
        }
        return stu;
    }
    public static int brute(int a[],int n,int m){
        int l=max(a,n),h=sum(a,n);
        for(int pages=l;pages<=h;pages++){
            int cnt=cntStu(a,pages);
            if(cnt==m) return pages;
        }
        return -1;
    }
//optimal

    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList());
        int a[]={25, 46, 28, 49, 24};
        int n = 5;
        int m = 4;
        int ans = brute(a, n, m);
        System.out.println("The answer is: " + ans);
    }
}
