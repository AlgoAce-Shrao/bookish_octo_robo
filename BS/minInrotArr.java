public class minInrotArr {
    // brute : Linear search -->O[n]

    // optimal :BS
    public static int findMin(int a[]) {
        int l = 0, h = a.length - 1, min = Integer.MAX_VALUE;
        while (l <= h) {
            int mid = (l + h) / 2;

            // optimization::
            // if the entire search space is sorted then the a[l] is the minimum element
            if (a[l] <= a[h]) {
                min = Math.min(min, a[l]);
                break;
            }
            // check if left sorted-->then the firse element of the search space will be the
            // minimum
            if (a[l] <= a[mid]) {
                min = Math.min(min, a[l]);
                // trim down the search space
                l = mid + 1;
            } else { // if right is unsorted,then min must be in the right half
                min = Math.min(min, a[mid]);
                h = mid - 1;
            }
        }
        return min;
    }

    // if the array contains duplicate elements then we need to do a bit more
    // operation
    public static int findMinDup(int a[]) {
        int l = 0, h = a.length - 1, min = Integer.MAX_VALUE;
        while (l <= h) {
            int mid = (l + h) / 2;

            // optimization::
            // if the entire search space is sorted then the a[l] is the minimum element
            if (a[l] <= a[h]) {
                min = Math.min(min, a[l]);
                break;
            }


            
            if (a[l] == a[mid] && a[mid] == a[h]) {
                 min = Math.min(min, a[l]);
                l = l + 1;
                h = h - 1;
                continue;
            }
           //if right is sorted
            if (a[l] <= a[mid]) {
                min = Math.min(min, a[l]);
                l = mid + 1;    //we might have min in the left half

            //if left is sorted
            } else {
                min = Math.min(min, a[mid]);
                h = mid - 1;    //we might have min in the right half
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int[] arr1 = { 1, 0, 0, 1, 1, 1, 1 };
        int[] arr2 = { 1, 3, 5 };
        // int ans = findMin(arr);
        int ans = findMinDup(arr2);
        System.out.println("The minimum element is: " + ans);
    }
}
