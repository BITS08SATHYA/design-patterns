package creational.prototype_02;

public class Rectangle extends Shape {

    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
