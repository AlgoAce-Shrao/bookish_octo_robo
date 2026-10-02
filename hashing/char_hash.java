/*=
program to understand the concept of hashing in character  array -->takign only lowercase here
 */
import java.util.*;

class char_hash {

    public static void main(String args[]) {
        try (//input
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string");
            String s = sc.next();
            // int a[]=new int[s.length()];

            //precompute
            int hash[] = new int[26];  //if we had to take any alphabet...it's range should be 256
            for (int i = 0; i < s.length(); i++) {
                hash[s.charAt(i) - 'a']++;
            
            ///if hash array size =256 then we need not subtract 'a'
            }

            //fetching
            System.out.println("Enter the size of array");
            int n = sc.nextInt();

            while (n-- > 0) {
                char c = sc.next().charAt(0);
                System.out.println("Frequency of " + c + " is " + hash[c - 'a']);//same here ..we need not subtract 'a'
            }
        }
    }
}
