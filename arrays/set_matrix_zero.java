import java.util.ArrayList;
import java.util.Arrays;

class brute {
    // T.C.: O[n*m*(n+m)]+O[n*m] || S.C.: O[n]+O[m]
    public static void markRow(ArrayList<ArrayList<Integer>> mat, int i, int m) {
        for (int j = 0; j < m; j++) {
            if (mat.get(i).get(j) != 0)
                mat.get(i).set(j, -1);
        }
    }

    public static void markCol(ArrayList<ArrayList<Integer>> mat, int j, int n) {
        for (int i = 0; i < n; i++) {
            if (mat.get(i).get(j) != 0)
                mat.get(i).set(j, -1);
        }
    }

    public static ArrayList<ArrayList<Integer>> brute(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat.get(i).get(j) == 0) {
                    brute.markRow(mat, i, m);
                    brute.markCol(mat, j, n);
                }
            }
        }
        // making the -1 as zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat.get(i).get(j) == -1) {
                    mat.get(i).set(j, 0);
                }
            }
        }
        return mat;
    }
}

class better {
    public static ArrayList<ArrayList<Integer>> better(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int row[] = new int[n];
        int col[] = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat.get(i).get(j) == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1)
                    mat.get(i).set(j, 0);
            }
        }
        return mat;
    }
}

class optimal {
    public static ArrayList<ArrayList<Integer>> optimal(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int col0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat.get(i).get(j) == 0) {
                    mat.get(i).set(0, 0);
                    if (j != 0) {
                        mat.get(0).set(j, 0);
                    } else {
                        col0 = 0;
                    }
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat.get(i).get(j) != 0) {
                    if (mat.get(0).get(j) == 0 || mat.get(i).get(0) == 0) {
                        mat.get(i).set(j, 0);
                    }
                }

            }
        }
        if (mat.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                mat.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                mat.get(i).set(0, 0);
            }
        }
        return mat;
    }
}

public class set_matrix_zero {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = optimal.optimal(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
