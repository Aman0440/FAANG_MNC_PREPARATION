package PracticeQuestion;

// Q5: Student (Encapsulation + Constructor)

// Create class Student:

// 🔒 Variables:
// private name
// private marks
// ⚙️ Requirements:
// Constructor → initialize both
// Setter → marks only (0–100)
// Getter → both
// Method → display


class Student{
    private String name;
    private int marks;


    Student(String name , int marks){
        this.name=name;
        this.marks=marks;
    }
    void setMarks(int marks){
        if(marks >= 0 && marks <=100){
            this.marks=marks;
        }else{
            System.out.println("Invalid marks");
        }
    }
    String getName(){
        return name;
    }
    int getMarks(){
        return marks;
    }
    void display(){
        System.out.println("Name : " + name + "  Marks : " + marks);
    }
}

public class Q1{
    public static void main(String[] args) {
         Student s1 = new Student("Aman", 26);
        s1.display();

        s1.setMarks(90);
        System.out.println("Updated Marks: " + s1.getMarks());

        s1.setMarks(120); // invalid case

    }
}
