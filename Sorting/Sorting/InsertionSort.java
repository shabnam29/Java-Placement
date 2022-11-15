public class InsertionSort {

    // Acending sort
    public static void insertionSort(int n[]) {//i=4,n=1
        for (int i = 1; i < n.length; i++) {
            int current = n[i];//current = 1
            int prev = i - 1;//prev = 4-1=3
            //  2, 4, 5, 3, 1
            // 1 2 3 4 5
            while (prev >= 0 && n[prev] > current) {//(2>=0&&4>1)->True
                n[prev + 1] = n[prev]; //n[3+1]->n[4]=n[3]->n[4]=5
                prev--;//prev=2
            }
            // Insertion
            n[prev + 1] = current;
        }
    }
    // Decending sort
    public static void decendingSort(int n[]) {
        for (int i = 1; i < n.length; i++) {
            int current = n[i];
            int prev = i - 1;
            while (prev >= 0 && n[prev] < current) {
                n[prev + 1] = n[prev]; 
                prev--;
            }
            // Insertion
            n[prev + 1] = current;
        }
    }

    public static void Print(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int n[] = { 2, 4, 5, 3, 1 };
        System.out.println("Before sorting");
        Print(n);
        // insertionSort(n);
        decendingSort(n);
        System.out.println("After sorting");
        Print(n);
    }
}
