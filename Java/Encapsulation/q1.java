package Encapsulation;

// Q1. Simple Getter & Setter

// Create class Person:

// private name
// private age

// 👉 Create:

// setName(), getName()
// setAge(), getAge()

class Person{
    private String name;
    private int age ;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setAge(int age){
        if(age>0){
        this.age=age;
        }
        else{
            System.out.println("invalid age");
        }
    }
    int getAge(){
        return age;
    }
}

public class q1 {
    public static void main(String[] args){
        Person P1 = new Person();
        P1.setName("Aman");
        System.out.println("Name : "+ P1.getName());
        P1.setAge(25);
        System.out.println("Age : " + P1.getAge());

    }
    
}
