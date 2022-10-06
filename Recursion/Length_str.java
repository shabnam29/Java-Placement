/* Write program to
 find the length of string using recursive function */

public class Length_str {

    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "shabnam";
        System.out.print(length(str));
    }
}
