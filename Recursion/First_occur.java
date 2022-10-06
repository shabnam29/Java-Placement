/* Write a function to find the first occurence
  of an element in an array
 */
//TC,SC->O(n)
public class First_occur {

    public static int Ocuurence_array(int n[],int key,int i){
        //Base case
        if(i==n.length){
            return -1;
        }
        //Recursion
        if(n[i]==key){
            return i;
        }
        return Ocuurence_array(n, key, i+1);
    }
    public static void main(String[] args) {
        int n[]={2,3,4,5,6,7,8,5};
        System.out.print(Ocuurence_array(n, 5, 0));
    }
}
