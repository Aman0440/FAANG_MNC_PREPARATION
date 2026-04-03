package PracticeQuestion;

// Create class Car:

// Constructors:
// Default → "Unknown", price 0
// Only brand
// Brand + price

// 👉 Use this() chaining

class Car{
    String brand;
    int price;

    Car(){ 
        this("Unknown" , 0);
    }
    Car(String brand ){
        this(brand,25000);
    }
    Car(String brand , int price){
        this.brand=brand;
        this.price=price;
    }
    void display(){
        System.out.println("Brand : "+ brand + " Price : " + price);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
        Car c2 = new Car("BMW");
        c2.display();
        Car c3 = new Car("Tata" ,35615);
        c3.display();

    }
}
