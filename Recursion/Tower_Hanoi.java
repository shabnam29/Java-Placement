/* Tower of Hanoi problem */

public class Tower_Hanoi {
    public static void tower(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk" + n + "from" + src + "to" + dest);
            return;
        }
        tower(n-1, src, dest, helper);
        System.out.println("Transfer disk" + n + "from" + src + "to" + helper);
        tower(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n=2;
        tower(n, "A", "B", "C");
        
    }

}
