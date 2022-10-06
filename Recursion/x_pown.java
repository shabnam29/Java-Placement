/* print x^n */
//Space complexity may be same
public class x_pown {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // power
        return x * power(x, n - 1);
    }
    public static int optimizedpower(int x,int n){
        if (n == 0) {
            return 1;
        }
        //optimized power
        int halfpower= optimizedpower(x, n/2);
        int halfpower_sq = halfpower*halfpower;
        if(n%2!=0){
            return x*halfpower_sq;
        }
        return halfpower_sq;
    }
    public static void main(String[] args) {
      System.out.println(power(2, 5)); // Time complexity->O(n)
      System.out.println(optimizedpower(2, 5)); //Time complexity->O(logn)
      
    }
}
