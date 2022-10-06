/* Print all the binary string of size N
 without consecutive one
 */

public class Binary_str {

    public static void Binary(int n, int last, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // Zero
        Binary(n - 1, 0, str+"0");
        // One's
        if (last == 0) {
            Binary(n - 1, 1, str+"1");
        }

    }

    public static void main(String[] args) {
        Binary(3, 0, "");
    }
}
