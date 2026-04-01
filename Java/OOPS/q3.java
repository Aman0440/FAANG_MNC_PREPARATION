package OOPS;

class Mobile {
    String brand ;
    int price ;

    void set(String b , int p){
        brand = b;
        price = p;
    }
    void display(){
        System.out.println("Mobile  : " + brand);
        System.out.println("Mobile Price : " + price);
    }
}

public class q3 {
    public static void main(String[] args){
        Mobile m1= new Mobile();
        m1.set("Iphone" , 15000);
        m1.display();
        
        Mobile m2 = new Mobile();
        m2.set("Samsung" , 25000);
        m2.display();

    }

}