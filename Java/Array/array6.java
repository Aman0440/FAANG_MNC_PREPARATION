package Array;
//Create a program that prints the seat numbers in a theater row, showing both the seat number (the index) and who is sitting there (the value):
public class array6 {
    public static void main(String[] args) {
        String[] seats = {"Jenny", "Liam", "Angie", "Bo"};

for (int i = 0; i < seats.length; i++) {
  System.out.println("Seat number " + i + " is taken by " + seats[i]);
}
    }
    
}
