package MultidimensionalArray;

public class q5 {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

        for(int[] num : myNumbers){
            for(int nums :num){
                System.out.println(nums);
            }
        }
    }
}
