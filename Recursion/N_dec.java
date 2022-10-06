/* Print 1 to 10 in decending order using Recursion */

public class N_dec{
    public static void decending(int n) {
        //Base case
        if(n==1){
            System.out.println(1);
            return;
        }
        //recursion
      System.out.println(n);
      decending(n-1);
    }
    public static void main(String[] args) {
        decending(10);
    }
}