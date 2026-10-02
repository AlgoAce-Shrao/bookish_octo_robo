//understanding hashing

import java.util.*;

class hsh1 {

    public static void main(String args[]) {
        //input the stinng
        try (Scanner sc = new Scanner(System.in)) {
            String s;
            s = sc.next();

            //precompute
            int hash[] = new int[256];
            for (int i = 0; i < s.length(); i++) {
                hash[s.charAt(i)]++;
            }

            //input queries
            int q = sc.nextInt();
            while (q-- > 0) {
                char c = sc.next().charAt(0);
                //fetch
                System.out.println(hash[c - 'a']);
            }

            //this one will not work since cp setup not done

            
        }
    }
}
