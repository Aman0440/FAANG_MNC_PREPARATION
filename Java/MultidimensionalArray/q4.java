package MultidimensionalArray;

public class q4 {
    public static void main(String[] args) {
        int[][] num = {{1,2,3,4},{7,5,8,9,6}};

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.println("myNumbers[" + i + "][" + j + "] = " + num[i][j]);
            }
        }
    }
    
}
