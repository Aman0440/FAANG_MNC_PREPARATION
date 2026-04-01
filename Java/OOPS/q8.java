package OOPS;


// Q8. Simple Calculator 🧮

// Create class Calculator:
// Methods:

// add(a, b)
// subtract(a, b)
// multiply(a, b)

class Calculator{
   
    int add (int a , int b){
        return a+b;
    }
    int substract(int a , int b){
        return a-b;
    }
    int multiply(int a ,int b){
        return a*b;
    }
}
public class q8 {
    public static void main(String[] args) {
        Calculator C1 = new Calculator();

        System.out.println("Addidtion : " + C1.add(26,36));
        System.out.println("Substraction : " + C1.substract(35,20));
        System.out.println("Multiplication : " + C1.multiply(45,35));
    }
}
