/* Write a function to find the last occurence of an
 * element in an array
 */

public class Last_occur {

    public static int occurencearray(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        //Recursion
        int isFount=occurencearray(arr, i+1, key);
        if(isFount==-1&&arr[i]==key){
            return i;
        }
        return isFount;
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,7,5,3,9,5,5,9,4};
        System.out.print(occurencearray(arr, 0, 5));
    }
}
