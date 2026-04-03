package Encapsulation;

class BankAccount{
    private int balance ;


    void setAmount(int amount){
    if(amount > 0){
           balance+=amount;
        }else{
            System.out.println("Invalid amount ");
        }
    }
    void setwithdraw(int amount){
        if(balance >=amount){
            balance-=amount;
        }
    }
    int getbalance(){
        return balance;
    }
}

public class q3 {
    public static void main(String[] args) {
        BankAccount B1 = new BankAccount();
        B1.setAmount(5000); 
        B1.setwithdraw(2451);
        System.out.println(B1.getbalance());
    }
}
