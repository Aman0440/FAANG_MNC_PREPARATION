package Constructor.Constructor_Overloading;

class Car{
    String brand;
    int price;


    Car(){
        this("BMW" , 5624520);
    }
    Car(String brand){
        this(brand , 456874);
    }
    Car(String brand , int price){
        this.brand=brand;
        this.price=price;
        }
    void display(){
    System.out.println("Brand : "+brand + "  Price : " + price);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Mercedis");
        Car c3 = new Car("Tata" , 2564882);

        c1.display();
        c2.display();   
        c3.display();
    }
    
}
