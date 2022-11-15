import java.util.*;

public class Countingsort {

    // ----- Acending order sorting ----
    public static void countingSort(int n[]){
        // Find largest number in an array
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            largest = Math.max(largest, n[i]);
        }

        //  creating count array
        int count[]=new int[largest+1];
        for(int j=0;j<n.length;j++){
            count[n[j]]++;
        }
        int j=0;
        for(int k=0;k<count.length;k++){
            while(count[k]!=0){
                n[j]=k;
                j++;
                count[k]--;
            }
        }
    }

    // ---- Decending order sorting ----
    public static void decendingSort(int n[]){
        // Find largest number in an array
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            largest = Math.max(largest, n[i]);
        }

        //  creating count array
        int count[]=new int[largest+1];
        for(int j=0;j<n.length;j++){
            count[n[j]]++;
        }
        int j=0;
        for(int k=count.length-1;k>=0;k--){
            while(count[k]!=0){
               
                n[j]=k;
                j++;
                count[k]--;
                
            }
        }
    }
        public static void Print(int n[]) {
            for (int i = 0; i < n.length; i++) {
                System.out.print(n[i]);
            }
            System.out.print("\n");
        }

    public static void main(String[] args) {
        int n[] = { 2,3,4,3,1,1,8,5 };
        // countingSort(n);
        decendingSort(n);
        Print(n);
    }

}
