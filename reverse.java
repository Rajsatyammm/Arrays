
// package Arrays;
import java.util.*;

public class reverse {

    public static void reverse(int[] A) {
        int size = A.length;
        int i = 0;
        while (i < size / 2) {
            int temp = A[i];
            // int calc = size-i-1;
            A[i] = A[size - i - 1];
            A[size - i - 1] = temp;
            i++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("enter data : ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        reverse(A);

        System.out.println("After reverse");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
