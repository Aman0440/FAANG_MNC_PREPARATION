package PracticeQuestion;


// Q22 (INTERVIEW 💥)

// Create:

// Payment → method pay()
// UPI, Card → override


class Payment{
  
    void pay(){
        System.out.println("Payment is in processes .....");
    }
}

class UPI extends Payment{  
    @Override
    void pay( ){
        System.out.println("Payment is done by UPI : ");
    }
}
class Card extends Payment{
    @Override
    void pay(){
        System.out.println("Payment is done by Card");
    }
}
public class Q4 {
    public static void main(String[] args){
        Payment p1 = new UPI();
        Payment p2 = new Card();

        p1.pay();
        p2.pay();

    }
    
}
