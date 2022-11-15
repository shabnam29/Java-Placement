
// Time complexity->O(n logn)
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
        Integer n[] = { 4, 3, 1, 2, 6, 7, 8, 9, 5, 10 };
        // Arrays.sort(n);
        // Arrays.sort(n, 0, 9);
        // Arrays.sort(n,Collections.reverseOrder());
        Arrays.sort(n,0,10,Collections.reverseOrder());

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
        }
        System.out.print("\n");
    }
}
