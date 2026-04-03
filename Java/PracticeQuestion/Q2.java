package PracticeQuestion;

// Q6: Bank Account (FULL OOPS 💣)

// Create class BankAccount:

// 🔒 Variable:
// private balance
// ⚙️ Requirements:
// Constructor → set initial balance
// deposit(amount)
// withdraw(amount)
// getBalance()

// 👉 Conditions:

// deposit > 0
// withdraw ≤ balance


class BankAccount{
    private int balance ;


    BankAccount(int balance){
        this.balance=balance;
    }
    void setDeposit(int Amount){
        if(Amount > 0){
            this.balance += Amount;
        }else{
            System.out.println("invalid Amount");
        }
    }
    void setWithdraw(int withdraw){
        if(withdraw>0 && withdraw <=balance){
            this.balance-=withdraw;
        }else{
            System.out.println("Invalid Amount");
        }
    }

    int getBalance() {
        return balance;
    }

    void display(){
        System.out.println("Amount : " + balance);
    }
}
public class Q2 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(5000);
        b1.display();

        b1.setDeposit(5460);
        System.out.println("After deposite : "+ b1.getBalance());

        b1.setWithdraw(6523);
        System.out.println("After Withdraw : " + b1.getBalance());

        b1.setDeposit(-45545);

    }
}
