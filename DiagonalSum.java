public class DiagonalSum {
    public static void sumDiagonal(int[][] A) {
        int sum = 0;
        // for(int i=0; i<A.length; i++) { //T(n) = O(n2)
        // for(int j=0; j<A[0].length; j++) {
        // if(i == j) {
        // sum += A[i][j];
        // }
        // }
        // }

        for (int i = 0; i < A.length; i++) { // T(n) = O(n)
            // primary diagonal i == j
            sum += A[i][i];

            // secondary diagonal i + j = N - 1
            if (i != A.length - i - 1)
                sum += A[i][A.length - i - 1];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] A = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        sumDiagonal(A);
    }
}
