/* SubString */

public class Substring {
    public static void method1(String str,int start,int end){
        String substr="";
        for(int i=start;i<end;i++){
            substr+=str.charAt(i);
        }
        System.out.println(substr);
    }

    public static void method2(String str,int start,int end){
        System.out.println(str.substring(start,end));
    }
    public static void main(String[] args) {
        String str="hello";
        method1(str, 1, 4);
        method2(str, 1, 3);
    }
}
