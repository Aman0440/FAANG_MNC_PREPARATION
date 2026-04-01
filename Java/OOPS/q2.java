package OOPS;

class Car {
    String brand = "BMW";
    int speed = 120;

    void display(){
        System.out.println("Car is Running");
    }
}

public class q2 {
    public static void main(String[] args) {
            Car c = new Car();
            c.display();
    }
}
