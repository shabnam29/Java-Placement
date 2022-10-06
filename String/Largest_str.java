/* For a given set of string , print the largest string */

public class Largest_str {
    public static void main(String[] args) {
        String name[]={"shabnam","hadi","mizba","shakira"};
        String largest=name[0];
        for(int i=0;i<name.length;i++){
            if(largest.compareTo(name[i])<0){
                largest=name[i];
            }
        }
        System.out.print(largest);
    }
}
