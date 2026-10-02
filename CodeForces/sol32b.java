import java.util.Scanner;

public class sol32b{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        char ch[]=input.toCharArray();
        StringBuilder sb=new StringBuilder();
        int n=input.length();
        int i=0;
        while(i<n){
            if(ch[i]=='.'){
                sb.append(0);
                i++;
            }else if(ch[i]=='-' && ch[i+1]=='-'){
                sb.append(2);
                i+=2;
            }else if(ch[i]=='-' && ch[i+1]=='.'){
                sb.append(1);
                i+=2;
            }
            // i++;
        }
        System.out.println(sb);
    }
}