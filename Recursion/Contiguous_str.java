public class Contiguous_str {

    public static int countsubstr(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countsubstr(str, i + 1, j, n - 1) + countsubstr(str, i, j - 1, n - 1)
                - countsubstr(str, i + 1, j - 1, n - 2);
       // System.out.println(res);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
            // System.out.println(res);
        }
        // System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        String str = "abf";
        int n = str.length();
        System.out.print(countsubstr(str, 0, n - 1, n));

    }
}
