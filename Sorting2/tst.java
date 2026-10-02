class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            int val;

            if (a[i] < b[j]) {
                val = a[i++];
            } else if (a[i] > b[j]) {
                val = b[j++];
            } else {
                val = a[i];
                i++;
                j++;
            }

            if (res.isEmpty() || res.get(res.size() - 1) != val) {
                res.add(val);
            }
        }

        while (i < a.length) {
            int val = a[i++];
            if (res.isEmpty() || res.get(res.size() - 1) != val) {
                res.add(val);
            }
        }

        while (j < b.length) {
            int val = b[j++];
            if (res.isEmpty() || res.get(res.size() - 1) != val) {
                res.add(val);
            }
        }

        return res;
    }
}
