

class Sortedsearch {
  
public static boolean sortedMatrix(int m[][],int key){
    int row=0,col=m[0].length-1;
    while(row<m.length&&col>=0){
        if(m[row][col]==key){
            System.out.println("Found at (" + row + "," + col + ")");
            return true;
        }
        else if(key<m[row][col]){
            col--;
        }
        else{
            row++;
        }
    }
    System.out.println("Key not found");
    return false;
}
 
    public static void main(String[] args) {
        int [][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,2},{13,14,15,16}};
       sortedMatrix(matrix,4);
    }
}