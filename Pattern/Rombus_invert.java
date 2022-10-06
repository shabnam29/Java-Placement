/* Solid Rhombus inverted pattern */

public class Rombus_invert {

        public static void Pattern(int n){
            for(int i=1;i<=n;i++){
            for(int j=1 ; j<=i-1 ; j++){
                System.out.print(" ");
            }
                for(int j=1 ; j<=n; j++){
                    System.out.print("*");
                }
             System.out.print("\n");
            }
        }
    
    
    
    public static void main(String[] args) {
        int n=5;
        Pattern(n);
    }
}


