package Constructor;

class Employee{
    String name ;
    int salary;


    Employee(String name , int salary){
        this.name=name;
        this.salary=salary;
    }

    void display(){
        System.out.println("Name : " + name + " , Salary : "+salary);
    }
}

public class q2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aman", 50000);
        e1.display();
    }
    
}
