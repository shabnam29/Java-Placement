/* for a given integer array of size N. you have to 
find all the occurence (indice) of given element (key) and print them. 
use the recursion function to solve this problem*/

public class All_occurence {

    public static void Alloccur(int n[] , int key,int i){
        //Base case
        if(i==n.length){
            return;
        }
        //Find key
        if(n[i]== key){
            System.out.print(i+" ");
        }
        Alloccur(n, key, i+1);
    }
    public static void main(String[] args) {
        int n[] ={3,2,4,5,6,2,7,2,2};
        Alloccur(n, 2, 0);
    }
}
