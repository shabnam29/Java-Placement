
/* Determine if 2 string are anagrams of each other*/

/* what are anagrams?
 -> if two strings contain the same character but in a different order, they can be said to be annagrams.
 Consider race and care. in this case, race charcater can formed into a study, pr case's character can be 
 formed into race. Below is a java program to check if two string are anagrams or not
 */

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        // convert to lowercase because that we dnot need to check the uppercase lettter
        // separately
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // check both length are equal
        if (str1.length() == str2.length()) {
            // Convert the strinng into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            // Sort the array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            // check the both are equal using inbuild function
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }
        }
        // if length are not equal
        else {
            System.out.println(str1 + " and " + str2 + "are not anagrams of each other");
        }
    }
}
