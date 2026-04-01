package OOPS;
// //Q6. Rectangle 📦

// Create class Rectangle:

// length, width

// Methods:

// area()
// perimeter()

class Rectangle{
    int length;
    int width;

    void setDimensions(int l , int w){
        length = l;
        width = w;
    }
    void area(){
        System.out.println("area of rectangle : " + length*width);
    }
    void perimeter(){
        System.out.println("Perimeter of rectangle : "+ (2*length+2*width));
    }
}
public class q6 {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.setDimensions(26,34);
        R1.area();
        R1.perimeter();
    }
}
