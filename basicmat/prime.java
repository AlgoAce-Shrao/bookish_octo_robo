import java.util.*;
class p{
    public void pr(int n){ //O[N]
        int c=0,f;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                c++;
        }
        if(c==2)
            System.out.println("The number is prime ");
        else
            System.out.println("The number is  not prime ");
        
    }
    //O[sqrt(N)]
    public  static boolean  checkPrime(int n){
        int  c=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                c++;
                if(n/i!=i){
                    c++;
                }
            }
        }
        if(c==2)
            return true;
        else
            return false;
    }
}
class prime{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check");
        num=sc.nextInt();
        p ob=new p();
        ob.pr(num);
    }
}