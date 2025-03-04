package creational.prototype_02;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {

    private static Map<String, Shape> shapeMap = new HashMap<>();

    static{
        shapeMap.put("Rectangle" , new Rectangle());
        shapeMap.put("Circle" , new Circle());
    }

    public static Shape getShape(String shapeType) throws CloneNotSupportedException {
        Shape shape = shapeMap.get(shapeType);
        return (Shape) shape.clone();
    }
}
