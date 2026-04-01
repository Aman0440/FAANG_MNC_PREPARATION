//To demonstrate a practical example of using arrays, let's create a program that calculates the average of different ages:
package Array;
public class array2 {
    public static void main(String[] args) {
    int[] ages = {20,50,45,30,19,48,75,35,64,24,26,37};

    float avg , sum = 0;
    int length = ages.length;

    for( int age : ages){
        sum += age;
    }
    avg = sum/length;

    System.out.println(avg);
    }
}
