
/* Print Nth Fibonocci number */
// TC:O(2^n),SC:O(n)
public class Fib_recursion {

    public static int fibonocci(int n){
        //Base case
        if(n==1||n==0){
            return n;
        }

        //Recursion
        return fibonocci(n-1)+fibonocci(n-2);
       
        
    }
    public static void main(String[] args) {
        System.out.print(fibonocci(5));
    }
}
