package OOPS;

class Student{
        String Name ="Aman";
        int Age = 24;

        void display(){
            System.out.println("Name : "+Name + ", Age : " + Age);
        }

    }

public class q1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();

    }
}



