package Array;
//Create a program with a list of numbers where you want to skip negative values, but stop completely if you find a zero:

public class array4 {
    public static void main(String[] args) {
         int[] arr={3, -1, 7, 0, 9};

        for(int num : arr){
            if (num < 0){
            continue;            
           }
            if(num == 0) {
            break;
            }
             System.out.println(num);
    }   
  }
}
