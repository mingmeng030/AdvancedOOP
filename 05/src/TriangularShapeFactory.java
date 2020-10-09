import java.awt.*;
public class TriangularShapeFactory implements ShapeFactory{
    @Override
    public Shape create(String type, Point[] points) {
        Shape s;

        if (type == "Triangle") {
            s = new Triangle(type, points);
            return s;
        } else if (type == "RightTriangle") {
            s = new RightTriangle(type, points);
            return s;
        } else {
            System.out.println("there's no triangle with that type");
            return null;
        }
    }
}
