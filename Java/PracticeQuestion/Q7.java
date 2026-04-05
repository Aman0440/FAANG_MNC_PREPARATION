package PracticeQuestion;

class Vehicle {
    private String brand;
    private int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    String getBrand() {
        return brand;
    }

    int getSpeed() {
        return speed;
    }

    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    private String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    @Override
    void move() {
        System.out.println("Car Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Car is running on " + fuelType);
    }
}

class Bike extends Vehicle {
    private boolean helmetRequired;

    Bike(String brand, int speed, boolean helmetRequired) {
        super(brand, speed);
        this.helmetRequired = helmetRequired;
    }

    @Override
    void move() {
        System.out.println("Bike Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        if (helmetRequired) {
            System.out.println("Bike is moving, helmet required");
        } else {
            System.out.println("Bike is moving");
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        Vehicle v1 = new Car("BMW", 120, "Petrol");
        Vehicle v2 = new Bike("Honda", 80, true);

        v1.move();
        System.out.println("-------------------");
        v2.move();
    }
}