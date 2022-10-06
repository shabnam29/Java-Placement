
/* Count  how many times lowercase vowels occured in a string entered
  by the user
 */

import java.util.*;
public class vowels {

    public static void vowelstr(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                count++;
            }
        }
        System.out.print(count);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        vowelstr(str);
    }
}
