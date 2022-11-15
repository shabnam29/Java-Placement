public class Bubblesort{

    // Acending sort
    public static void bubbleSort(int n[]){
        for(int i=0;i<n.length-1;i++){
            for(int j=0;j<n.length-1-i;j++){
                if(n[j]>n[j+1]){
                    int temp;
                     temp = n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
    }
    // Decending sort
    public static void decendingSort(int n[]){
        for(int i=0;i<n.length-1;i++){
            for(int j=0;j<n.length-1-i;j++){
                if(n[j]<n[j+1]){
                    int temp;
                     temp = n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
    }
    public static void Print(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]);
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        int n[]={2,4,5,3,1};
        System.out.println("Before sorting");
        Print(n);
        // bubbleSort(n);
        decendingSort(n);
        System.out.println("After sorting");
        Print(n);
    }
}