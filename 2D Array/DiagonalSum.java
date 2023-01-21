

class HelloWorld {
  
  // Approach 1
//   Time complexity :O(n^2)
   public static int diagonalSum(int m[][]){
       int sum=0;
       for(int i=0;i<m.length;i++){
           for(int j=0;j<m[0].length;j++){
               if(i==j){
                   sum+=m[i][j];
               }
               else{
                   if(i+j==m.length-1){
                       sum+=m[i][j];
                   }
               }
           }
       }
       return sum;
   }
        
    // Approach 2
    // Time complexity:O(n)
    public static void diagonalMatrix(int m[][]){
        int sum=0;
        for(int i=0;i<m.length;i++){
            sum+=m[i][i];
            if(i!=m.length-1-i){
                sum+=m[i][i];
            }
        }
        System.out.print("The sum:"+ sum);
    }
 
    public static void main(String[] args) {
        int [][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,2},{13,14,15,16}};
       diagonalMatrix(matrix);
    }
}