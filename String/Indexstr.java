//How to find oe specify the index in java
public class Indexstr {
    public static void printchar(String ch){
        for(int i=0;i<ch.length();i++){
            System.out.print(ch.charAt(i)+ " ");
        }
    }
    public static void main(String[] args) {
        String ch="shabnam";
        printchar(ch);
    }
}
