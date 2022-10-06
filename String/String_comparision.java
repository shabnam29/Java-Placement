/* String Comparision */

public class String_comparision {
    public static void method1(String str1, String str2) {
        if (str1 == str2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

    public static void method2(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        method1(str1, str2);
        method2(str1, str2);
    }
}
