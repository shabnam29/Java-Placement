public class N_inc {
    public static void decending(int n) {
        //Base case
        if(n==1){
            System.out.println(1);
            return;
        }
        //recursion
      decending(n-1);
      System.out.println(n);
    }
    public static void main(String[] args) {
        decending(10);
    }
}
