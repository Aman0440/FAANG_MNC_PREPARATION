package PracticeQuestion;


class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void displayRole() {
        System.out.println("I am a Person");
    }
}

class Employee extends Person {
    private int salary;

    Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }

    @Override
    void displayRole() {
        System.out.println("I am an Employee");
    }
}

class Manager extends Employee {
    private int bonus;

    Manager(String name, int age, int salary, int bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    int getBonus() {
        return bonus;
    }

    int calculateTotalSalary() {
        return getSalary() + bonus;
    }

    @Override
    void displayRole() {
        System.out.println("I am a Manager");
    }
}

   

public class Q5 {
     public static void main(String[] args) {
        Manager m1 = new Manager("Aman", 25, 50000, 10000);

        System.out.println("Name: " + m1.getName());
        System.out.println("Age: " + m1.getAge());
        System.out.println("Salary: " + m1.getSalary());
        System.out.println("Bonus: " + m1.getBonus());
        System.out.println("Total Salary: " + m1.calculateTotalSalary());
        m1.displayRole();

        System.out.println("----- Polymorphism -----");

        Person p1 = new Manager("Raj", 30, 60000, 15000);
        p1.displayRole();
    }
    
}
