package Polymorphisum;
// Q3

// Create:

// Shape
// Circle
// Rectangle

// Override area()

class Shape{
    void area(){
        System.out.println("Area");
    }
}
class Circle extends Shape{
    @Override
    void area(){
        System.out.println("Area of Circle");
    }
}
class Rectangle extends Shape{
    @Override
    void area(){
        System.out.println("Area of Rectangle");
    }
}
public class Q3 {
    public static void main(String[] args){
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
    
}
