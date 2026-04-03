package Constructor.Constructor_Overloading;

class Employeee{
    String name ;
    int age ;


    Employeee(){
        this("Aman" , 18);
    }
    Employeee(String name){
        
        this(name ,25);
    }
    Employeee(String name , int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name : " + name + " , age : "+ age);
}
}

public class Q2 {
    public static void main(String[] args){
        Employeee e1 = new Employeee();
        Employeee e2 = new Employeee("Aman");
        Employeee e3 = new Employeee ("Aman" , 26);

        e1.display();
        e2.display();
        e3.display();
    }
    
}
