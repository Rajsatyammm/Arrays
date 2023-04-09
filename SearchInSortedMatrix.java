public class SearchInSortedMatrix {

    public static boolean stairCaseSearch(int[][] matrix, int key) { // T(n) = O(n + m)
        int row = matrix.length - 1, colm = 0;
        while (row >= 0 && colm <= matrix[0].length - 1) {
            if (matrix[row][colm] == key) {
                System.out.println("key found at (" + row + " , " + colm + ")");
                return true;
            } else if (key < matrix[row][colm]) {
                row--;
            } else {
                colm++;
            }
        }
        System.out.println("Element NF");
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        stairCaseSearch(matrix, 10);
    }
}
