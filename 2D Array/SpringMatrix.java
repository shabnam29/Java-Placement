

class HelloWorld {
    public static void SpringMatrix(int m[][]){
        int start_Row=0,end_Row=m.length-1,start_Col=0,end_Col=m[0].length-1;
        while(start_Row<=end_Row&&start_Col<=end_Col){
            
        // Top
        for(int i = start_Col;i<=end_Col;i++){
            System.out.print(m[start_Row][i]+" ");
        }
        
        // Right
        for(int j=start_Row+1;j<=end_Row;j++){
            System.out.print(m[j][end_Col]+" ");
        }
        
        // Bottom
        for(int k=end_Col-1;k>=start_Col;k--){
            if(start_Row==end_Row){
                break;
            }
            System.out.print(m[end_Row][k]+" ");
        }
        
        // Left
        for(int z=end_Row-1;z>=start_Row+1;z--){
            if(start_Col==end_Col){
                break;
            }
            System.out.print(m[z][start_Col]+" ");
            
        }
        start_Row++;
        start_Col++;
        end_Row--;
        end_Col--;
    }
    System.out.println();
    }
    
 
    public static void main(String[] args) {
        int [][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,2},{13,14,15,16}};
        SpringMatrix(matrix);
    }
}