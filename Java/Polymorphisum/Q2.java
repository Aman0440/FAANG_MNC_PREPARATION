package Polymorphisum;


// Q2

// Create:

// Payment
// UPI
// Card

// Use parent reference and call pay()

class Payment{
    void pay(){
        System.out.println("Payment Is in Processing ..... ");
    }
}
class UPI extends Payment{
    @Override
    void pay(){
        System.out.println("Payment Successfull Through UPI ");
    }
}
class Card extends Payment{
    @Override
    void pay(){
        System.out.println("Payment Successfull Through Card ");
}
}
public class Q2 {
    public static void main(String[] args){
       Payment p1 = new UPI();
       Payment p2 = new Card();

       p1.pay();
       p2.pay();
    }
    
}
