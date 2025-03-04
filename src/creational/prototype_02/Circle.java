package creational.prototype_02;

public class Circle extends Shape {

    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
