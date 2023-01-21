// Print the number of 7s that are in the 2d array

public  class numberof7S{
    public static void main(String[] args){
        int m[][]={{1,2,3,4},{7,8,7,9},{1,2,7,4},{3,5,7,6}};
        int count=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}