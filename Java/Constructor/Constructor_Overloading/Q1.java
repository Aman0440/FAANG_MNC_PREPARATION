package Constructor.Constructor_Overloading;

// Q1

// Create class Employee:

// Constructors:
// No parameter → default values
// Only name
// Name + salary

// 👉 Add display() method

class Employee{
    String name;
    int age;


    Employee(){
         this.name = "Aman";
         this.age=36;

    }

    Employee(String name){
        this.name=name;
        this.age =12;
    }

    Employee(String name , int age){
        this.name=name;
        this.age=age;
    }   

    void display(){
        System.out.println("Name : " + name + "  age : " + age);
    }
    
}

public class Q1 {
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee("Raj");
        Employee e3 = new Employee("Aman" , 25);

        e1.display();
        e2.display();
        e3.display();

    }
    
}
