package Constructor;

class Student{
    String name ;
    int age ;

    Student(String name , int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name : "+name + ",   Age : " + age);
    }
}

public class q1 {
    public static void main(String[] args) {
        Student s1 = new Student("Aman" , 26);
        s1.display();
    }
    
}
