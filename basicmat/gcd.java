import java.util.*;
//euclidean algorithm followed
//Time complexity --> O(log base phi(min(a,b)))
class gcd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the value of a :");
        a = sc.nextInt();
        System.out.println("Ente the value of b ");
        b = sc.nextInt();

        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0)
            System.out.println("GCD is :" + b);
        else
            System.out.println("GCD is :" + a);
    }

}
