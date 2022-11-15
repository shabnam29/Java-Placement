public class Selectionsort {

    // Acending sort
    public static void selectionSort(int n[]){
        for(int i=0;i<n.length;i++){
            int minpos =i;
            for(int j=i+1;j<n.length;j++){
                if(n[minpos]>n[j]){
                    minpos=j;
                }
            }
            int temp = n[minpos];
            n[minpos]=n[i];
            n[i]=temp;
        }
    }
    // Decending selection sort
    public static void decendingSort(int n[]){
        for(int i=0;i<n.length;i++){
            int minpos =i;
            for(int j=i+1;j<n.length;j++){
                if(n[minpos]<n[j]){
                    minpos=j;
                }
            }
            int temp = n[minpos];
            n[minpos]=n[i];
            n[i]=temp;
        }
    }
    public static void Print(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]);
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        int n[]={2,1,5,4,3};
        System.out.println("Before sorting");
        Print(n);
        // selectionSort(n);
        decendingSort(n);
        System.out.println("After sorting");
        Print(n);        
    }
}
