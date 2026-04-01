//we create a program that finds the lowest age among different ages:
package Array;

public class array3 {
    public static void main(String[] args) {
        
        int age[] = {35,45,26,27,29,49,42,39};
        
        int lowest = age[0];

        for(int ages :age){
            if(lowest > ages){
                lowest=ages;
            }
        }
        System.out.println("Lowest age : "+lowest);

    }
}
