
import java.util.HashMap;

class brute {

    // T.C.: O[n^3] S.C.:O[1]
    public static int brute(int a[], int K) {
        int n = a.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int xor = 0;
                for (int k = i; k <= j; k++) {
                    xor ^= a[k];
                }
                if (xor == K)
                    c++;
            }
        }
        return c;
    }
}

class better {
    // T.c. :O[n^2] || S.C.:o[1]
    public static int better(int a[], int k) {
        int n = a.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            int xor = 0;
            for (int j = i; j < n; j++) {
                xor ^= a[j];
                if (xor == k)
                    c++;
            }
        }
        return c;
    }
}

class optimal {
    public static int optimal(int a[], int k) {
        int n = a.length;
        int xor = 0;
        int c = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < n; i++) {
            xor ^= a[i];

            int frontXor = xor ^ k;

            c += mp.getOrDefault(frontXor, 0);

            mp.put(xor, mp.getOrDefault(xor, c) + 1);

        }
        return c;
    }
}

class subarrayswith_xorK {
    public static void main(String[] args) {
        int[] a = { 4, 2, 2, 6, 4 };
        int k = 6;
        int ans = optimal.optimal(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}