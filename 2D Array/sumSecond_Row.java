// Print out the sum of the numbers in the second row of the "nums" array.

public class sumSecond_Row{
    public static void main(String[] args){
        int n[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum+=n[1][i];
        }
        System.out.println(sum);
    }
}