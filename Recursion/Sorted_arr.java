/* Check if a given array is sorted or not */
//TC,SC->O(n)
public class Sorted_arr {

    public static boolean sortedarray(int arr[], int i) {
        // base case
        if (i == arr.length - 1) {
            return true;
        }
        // Recursion
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sortedarray(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 8, 9, 10 };
        System.out.print(sortedarray(arr, 0));
    }
}
