/* Print star patten */

public class Star_pattern {
 
        public static void Pattern(int n){
            
            for(int i=1 ; i<=n ;i++){
                for(int j=1 ; j<=i ; j++){
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

