// Write program to find the transpos of a matrix.

public class Transpos{
    
    public static void tranposeMatrix(int m[][]){
        int row=m.length,col=m[0].length;
        
        //Transpose matrix
        int [][]tranpose = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                tranpose[j][i] = m[i][j];
            }
        }
         printMatrix(tranpose);
         System.out.println();
    }
    
    public static void printMatrix(int m[][]){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]){
        int matrix[][]={{2,3,7},{5,6,7}};
        System.out.println("Original Matrix\n");
        printMatrix(matrix);
        System.out.println("Tranpose Matrix");
        tranposeMatrix(matrix);
       
    }
}