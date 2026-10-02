class brute{
    public static int brute(int a[]){
        int profit=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                profit=Math.max(profit,a[j]-a[i]);
            }
        }
        return profit;
    }
}
class optimal1{
    public static int optimal1(int a[]){
        int mini=a[0],profit=0;
        for(int i=1;i<a.length;i++){
            int cost=a[i]-mini;
            profit=Math.max(profit, cost);
            //update mini as well from 1 to (i-1)th index
            mini=Math.min(mini,a[i]);
        }
        return profit;
    }
}
class optimal2{
    public static int optimal2(int a[]){
        int mini=Integer.MAX_VALUE,profit=0;
        for(int i=0;i<a.length;i++){
            mini=Math.min(mini,a[i]);
            profit=Math.max(profit,a[i]-mini);
        }
        return profit;
    }
}
public class buy_sell_stock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        int maxPro = optimal2.optimal2(arr);
        System.out.println("Max profit is: " + maxPro);
    }
}
