/* Given n friends , each one can remain single or can be paired op with some
 other friends Each friends can be paired only once. Find out the total number of ways
 in which friends can be reamin single or can be paired up
 */

public class Friends_pair {

    public static int totol_ways(int n) {
        // Base case
        if (n == 1 || n == 2) {
            return n;
        }

       return totol_ways(n-1)+(n-1)*totol_ways(n-2);
    }

    public static void main(String[] args) {
        System.out.print(totol_ways(4));
    }
}
