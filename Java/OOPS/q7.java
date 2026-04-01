package OOPS;

// Q7. Employee Salary

// Create class Employee:

// name
// salary

// 👉 Method:

// If salary > 50,000 → print "High Salary"
// Else → "Low Salary"


class Employee{
    String name ;
    int Salary ;

    void setData(String n , int S){
        name = n ;
        Salary = S;
    }
    void salary(){
        if(Salary > 50000){
            System.out.println(name + ":  Salary is High");
        }else{
            System.out.println(name + " : Salary is Low ");
        }
    }
}

public class q7 {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.setData("Aman" ,56220 );
        E1.salary();
    }
}
