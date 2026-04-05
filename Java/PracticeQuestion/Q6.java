package PracticeQuestion;

class Product {
    private String name;
    private int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product {
    private int warranty;

    Electronics(String name, int price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    void displayProduct() {
        System.out.println("Electronics Product");
        System.out.println("Product Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Warranty: " + warranty + " years");
    }
}

class Clothing extends Product {
    private String size;

    Clothing(String name, int price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    void displayProduct() {
        System.out.println("Clothing Product");
        System.out.println("Product Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Size: " + size);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Product p1 = new Electronics("Laptop", 50000, 2);
        Product p2 = new Clothing("T-Shirt", 1000, "M");

        p1.displayProduct();
        System.out.println("-------------------");
        p2.displayProduct();
    }
}