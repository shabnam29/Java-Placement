/* Butterfly Pattern */
import java.util.*;
public class Butterfly {
    public static void Pattern(int n) {

        //LOOP !

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int z=1;z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }

        //LOOP 2

        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int z=1;z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        Pattern(n);
    }
}
