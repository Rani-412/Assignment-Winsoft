public class MaximumSumPath {
    public static void main(String[] args) {
        int[] X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
        int[] Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };

        int maxSum = findMaximumSumPath(X, Y);
        System.out.println("Maximum sum: " + maxSum);
    }

    public static int findMaximumSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int i = 0, j = 0;
        int maxSum = 0, sumX = 0, sumY = 0;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i];
                i++;
            } else if (X[i] > Y[j]) {
                sumY += Y[j];
                j++;
            } else {
                maxSum += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        while (i < m) {
            sumX += X[i];
            i++;
        }

        while (j < n) {
            sumY += Y[j];
            j++;
        }

        maxSum += Math.max(sumX, sumY);
        return maxSum;
    }
}