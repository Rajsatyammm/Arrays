public class SearchinRotated {

    public static int searchIterative(int arr[], int target) {
        int si = 0;
        int ei = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            int mid = (si + ei) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[si] <= arr[mid]) { // on line L1
                if (arr[si] <= target && target <= arr[mid]) {
                    // case a : left of L1
                    ei = mid - 1;
                } else {
                    // case b : right of mid
                    si = mid + 1;
                }
            } else { // on line L2
                if (arr[mid] <= target && target <= arr[ei]) {
                    // case c : right of mid
                    si = mid + 1;
                } else {
                    // case d : left of mid
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int searchRecursive(int[] arr, int target, int si, int ei) {
        // Base case
        if (si > ei) {
            return -1;
        }

        int mid = (si + ei) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {// on line L1
            // left of line 1
            if (arr[si] <= target && target <= arr[mid]) {
                // case a : left of L1
                return searchRecursive(arr, target, si, mid - 1);
            } else {
                // right of mid
                return searchRecursive(arr, target, mid + 1, ei);
            }
        }

        else { // on line L2
            if (arr[mid] <= target && target <= arr[ei]) {
                // case c : right of mid
                return searchRecursive(arr, target, mid + 1, ei);
            } else {
                // case d : left of mid
                return searchRecursive(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 2, 3, 4 };
        System.out.println(searchRecursive(arr, 10, 0, arr.length - 1));
        System.out.println(searchIterative(arr, 10));
    }
}
