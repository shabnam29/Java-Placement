
/* Check if a String is a palindrome or not*/
//Time complexity->O(n)
public class Palindrome {
    public static boolean palindrome_str(String str) {
        // int n=str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i)!= str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "root";
        System.out.print(palindrome_str(str));
    }
}
