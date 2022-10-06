
/* Given a "2Xn" board and tiles of size "2X1", count the number of 
 ways to the tile the given board using the 2X1 titles.
 (A title either be place horizontally or vertically)
 */

public class Tilling_pro {

    // Method 1
    public static int tilling(int n){
    //Base case
    if(n==0||n==1){
        return 1;
    }
    //horizontal choose
    int horizontal = tilling(n-2);
    //verical choose
    int vertical = tilling(n-1);
    return horizontal+vertical;
    }

    public static int tilling1(int n){
          //Base case
    if(n==0||n==1){
        return 1;
    }
    return tilling(n-1)+tilling(n-2);
    }
    public static void main(String[] args) {
        System.out.print(tilling1(5));
    }
}
