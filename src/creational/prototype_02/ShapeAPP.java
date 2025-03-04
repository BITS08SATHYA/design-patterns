package creational.prototype_02;

public class ShapeAPP {
    public static void main(String[] args) throws CloneNotSupportedException {

        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle.type);
        rectangle.draw();
        System.out.println("Original Object: " + rectangle);

        Shape clonedShape1 = ShapeRegistry.getShape("Rectangle");
//        System.out.println("Shape: " + clonedShape1.getType());
        clonedShape1.draw();
        System.out.println("Cloned Object: " + clonedShape1);

//        Shape clonedShape2 = ShapeRegistry.getShape("Circle");
//        System.out.println("Shape: " + clonedShape2.getType());
//        clonedShape2.draw();

    }
}
