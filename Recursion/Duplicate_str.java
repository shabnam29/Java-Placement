/* Remove duplicate in a string */

public class Duplicate_str {

    public static void Remove_duplicate(String str , int i , StringBuilder newstr, boolean map[]){
        //Base case
        if(i==str.length()){
            System.out.print(newstr);
            return ;
        }
        
        char curchar = str.charAt(i);
        //remove the duplicate
        if(map[curchar - 'a']==true){
            Remove_duplicate(str, i+1, newstr, map);
        }
        // assign true in map for unique variable
        else{
            map[curchar-'a']=true;
            Remove_duplicate(str, i+1,newstr.append(curchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "xxyyzz";
        Remove_duplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
