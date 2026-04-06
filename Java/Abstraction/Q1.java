package Abstraction;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }

    public void stop() {
        System.out.println("Car stops with brake");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with self start");
    }

    public void stop() {
        System.out.println("Bike stops with brake");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        c.stop();

        b.start();
        b.stop();
    }
}