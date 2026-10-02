import java.util.*;
public class sol1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input:");
    int n=sc.nextInt();
    int [] tickets=new int[n];
    System.out.println("Enter the tickets:");
    for(int i=0;i<n;i++){
      tickets[i]=sc.nextInt();
    }
    System.out.println("Enter the index :");
    int k=sc.nextInt();

    int time=timeToBuy(tickets,k);
    System.out.println("Output  "+": "+time);
  }
  public static int timeToBuy(int [] tickets,int k){
    Queue<Integer> qu=new LinkedList<>();
    for(int i=0;i<tickets.length;i++){
      qu.offer(i);
    }
    int time=0;

    while(!qu.isEmpty()){
      int idx=qu.poll();
      tickets[idx]--;
      time++;
      if(tickets[idx] >0){
        qu.offer(idx);
      }
      if(idx== k && tickets[idx]==0){
        break;
      }
    }
    return time;
  }
}