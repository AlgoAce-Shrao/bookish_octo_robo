import java.util.*;
class sol2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of cards:");
    int n=sc.nextInt();
    int[] deck=new int[n];
    System.out.println("Enter the cards:");
    for(int i=0;i<n;i++){
      deck[i] =sc.nextInt();
    }
    int []result =deckReveal(deck);
    System.out.println("Initial order of decks:");
    System.out.println(Arrays.toString(result));
  }
  public static int[] deckReveal(int[]deck){
    int n=deck.length;
    Arrays.sort(deck);
    Deque<Integer> dq=new LinkedList<>();
    for(int i=n-1;i>=0;i--){
      if(!dq.isEmpty()){
        dq.addFirst(dq.pollLast());
      }
    dq.addFirst(deck[i]);
    }
    int [] result=new int[n];
    int idx=0;
    for(int card:dq){
      result[idx++]=card;
    }
    Arrays.sort(result);
    return result;
  }
}