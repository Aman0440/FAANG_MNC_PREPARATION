package OOPS;

class BankAcount{
    int balance;

    void deposit(int Amount){
        if(Amount>0){
        balance += Amount;
        System.out.println("Deposited Amount : "+Amount);
        System.out.println("Balance : "+ balance);
        }else {
        System.out.println("Invalid amount ");
        }
    }
    void withdraw(int amount ){
        if(balance >=amount){
            balance-=amount ;
            System.out.println("Withdraw Amount : " + amount);
        }else {
            System.out.println("Invalid Amount");
        }
    
    }
    void displayBalance(){
            System.out.println("Balance : " + balance);
        }
    
}

public class q5 {
    public static void main(String[] args) {
        BankAcount b1 = new BankAcount();
        b1.deposit(5000);
        b1.withdraw(3500);
        b1.displayBalance();
    }

    
}