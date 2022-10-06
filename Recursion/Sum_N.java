/* Print Sum of first n natural number */
/*TC,SC->O(n)*/
public class Sum_N {

    public static int Sum(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        // recursion
        return n+ Sum(n - 1);
        

    }

    public static void main(String[] args) {
        System.out.print(Sum(10));
    }
}
