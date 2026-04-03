package Inheritance;

// Q1

// Create:

// Parent class → Person
// name
// method → displayName()
// Child class → Student
// marks
// method → displayMarks()

// 👉 Create object of Student and call both methods


class Person {
    String name;
    void setName(String name){
        this.name=name;
    }
   
    void displayName(){
         System.out.println("Name : " + name);
    }
}
class Student extends Person {
    int marks;
    void setMarks(int marks){
        if(marks >= 0 && marks <=100){
            this.marks=marks;
        }else{
            System.out.println("invalid Marks");
        }
    }
   
    void displayMarks(){
         System.out.println("Marks : " + marks);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Aman"); 
        s.setMarks(100);
        
        s.displayName();
        s.displayMarks();

        s.setMarks(125);
       
    }
    
}
