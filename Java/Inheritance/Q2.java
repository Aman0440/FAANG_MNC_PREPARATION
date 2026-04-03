package Inheritance;


// Q2: Employee System (REAL-WORLD)
// 🎯 Create:
// 🔹 Parent Class → Employee
// Variables:
// private name
// private salary
// Methods:
// Constructor → initialize both
// getName()
// getSalary()
// 🔹 Child Class → Manager
// Extra Variable:
// bonus
// Methods:
// Constructor → initialize name, salary, bonus
// calculateTotalSalary()
// 👉 total = salary + bonus

class Employee {
    private String name;
    private int salary;

    Employee(String name , int salary ){
        this.name=name;
        this.salary=salary;
    }
        String getName(){
            return name;
        }
        int getSalary(){
            return salary;
        }

}
class Manager extends Employee{
    private int bonus;

    Manager(String name , int salary ,int bonus){
        super(name, salary);
        this.bonus=bonus;
       
        
    }

     int calculateTotalSalary() {
        return getSalary() + bonus;
    }


}

public class Q2 {
    public static void main(String[] args) {
        Manager m1 = new Manager("Aman", 50000, 2355);

        System.out.println("Name: " + m1.getName());
        System.out.println("Salary: " + m1.getSalary());
        System.out.println("Total Salary: " + m1.calculateTotalSalary());
        
    }
    
}
