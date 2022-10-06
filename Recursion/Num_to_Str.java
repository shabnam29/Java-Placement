/* you are given a number (eg-2019), convert it into a string
 * of english like "two zero one nine". Use recursive
 * function to solve this problem
 */

public class Num_to_Str {
    static String digit[] = { "Zero" , "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printdigit(int n) {
        if (n == 0) {
            return;
        }
        // take last digit
        int last_dig = n % 10; // last digit value
        printdigit(n / 10); // remaining digit
        System.out.print(digit[last_dig] + " ");//it check with index and return the index value

    }

    public static void main(String[] args) {
        printdigit(2019);
        System.out.println();
    }
}
