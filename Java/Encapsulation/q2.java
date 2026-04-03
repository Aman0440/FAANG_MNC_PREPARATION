package Encapsulation;

class StudentMarks {
    private int marks;

    void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }

    int getMarks() {
        if (marks == 0) {
            System.out.println("Marks not set or invalid");
        }
        return marks;
    }
}

public class q2 {
    public static void main(String[] args) {
        StudentMarks s1 = new StudentMarks();
        s1.setMarks(90);
        System.out.println(s1.getMarks());

        StudentMarks s2 = new StudentMarks();
        s2.setMarks(102);
        System.out.println(s2.getMarks());
    }
}