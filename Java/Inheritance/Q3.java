package Inheritance;


class Shape{
    void area(){
        System.out.println("Calculating Area .....");
    }
}
class Circle extends Shape{
    float radius;

    Circle(float radius){
        this.radius=radius;
    }
    @Override
    void area(){
        System.out.println(" Radius : " + 3.14*radius*radius);
    }
}
class Rectangle extends Shape{
    int length;
    int width;

    Rectangle(int length , int width){
        this.length=length;
        this.width=width;
    }
    @Override
    void area(){
        System.out.println("area Of rectangle : " + (length*width));
    }

}
public class Q3 {
    public static void main(String[] args) {
    Shape s1 = new Circle(50);
    Shape s2 = new Rectangle(56,34);

    s1.area();
    s2.area();
    

    }
    
}
