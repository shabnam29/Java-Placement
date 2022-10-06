/* Print Factorial of Number n */
// TC:O(n),Sc:O(n)

public class Fact {

    public static int factorial(int n) {
        // Base case
        if (n == 1) {
            return n;
        }
        // Recursion
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
