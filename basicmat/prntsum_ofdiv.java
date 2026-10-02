//wap to print the sum of the divisors of a numbers inout from 1 to n
class mn {
    public  int sumOfDivisors(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    s += j;
                    if ((i / j) != j) {
                        s += (i/j);
                    }
                }
            }
        }
        return s;
    }
}
class prntsum_ofdiv{
    public static void main(String args[]){
        mn ob=new mn();
        System.out.println("Result :"+ob.sumOfDivisors(4));
    }
}