import java.util.HashMap;

class brute {
    public static int brute(String s, int n) {
        // int maxLen=0;
        HashMap<Character, Integer> mp = new HashMap<>();
        int maxLen = 0;
        char ch[] = s.toCharArray();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (!mp.containsKey(ch[j])) {
                    maxLen = Math.max(maxLen, j - i + 1);
                    mp.put(ch[j], mp.getOrDefault(ch[j], 0) + 1);
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }
}

class better {//not correct
    // T.C.: O[n *1] for hashmap...S.C:O[n]-->worst case if all elements are unique
    public static int better(String s, int n) {
        HashMap<Character, Integer> mp = new HashMap<>();
        StringBuilder preString = new StringBuilder();
        int len = 0;
        for (int i = 0; i < n; i++) {
            if (!mp.containsKey(s.charAt(i))) {
                preString.append(s.charAt(i));
                len = Math.max(len, preString.length());
                mp.put(s.charAt(i), i);
            } else {
                preString.setLength(0);
            }
        }
        return len;
    }
}

class optimal {///T.C.:O[n] S.C.;O[n] if all the elements are unique
    public static int optimal(String s, int n) {
        int len = 0;
        int left = 0, right = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        while (right < n) {

            while (mp.containsKey(s.charAt(right))) {
                left = Math.max(mp.get(s.charAt(right)) + 1, left); // // move the left pointer to the right of the
                                                                    // previous index of ch
            }

            mp.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;

        }
        return len;
    }
}

public class LongestSubstring {
    public static void main(String args[]) {
        String s = "abcdeacdwyxklmbc";
        int n = s.length();
        int length = optimal.optimal(s, n);
        System.out.println("Longest length:" + length);
    }

}
