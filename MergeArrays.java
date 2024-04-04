import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };

       
        mergeArrays(X, Y);

        
        System.out.println("Merged array X[]: " + Arrays.toString(X));
    }

    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        
        int index = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[index] = X[i];
                index--;
            }
        }

        
        int i = n; // Start index of X[] with non-zero elements
        int j = 0; // Start index of Y[]
        int k = 0; // Start index of merged array

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k] = X[i];
                i++;
            } else {
                X[k] = Y[j];
                j++;
            }
            k++;
        }

        
        while (j < n) {
            X[k] = Y[j];
            j++;
            k++;
        }
    }
}