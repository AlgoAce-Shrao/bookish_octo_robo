import java.util.*;

public class sol266b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        char ch[] = s.toCharArray();
        while (t-- > 0) {
            int i=0;
            while(i<n-1) {
                if (ch[i] == 'B' && ch[i + 1] == 'G') {
                    char temp = ch[i];
                    ch[i] = ch[i + 1];
                    ch[i + 1] = temp;
                    i+=2;
                    
                }
                else i++;
            }
        }
        System.out.println(ch);
    }
}
