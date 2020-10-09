import java.awt.*;
public class TriangularShapeFactory implements ShapeFactory{
    private static TriangularShapeFactory t;

    private TriangularShapeFactory(){}

    public static TriangularShapeFactory getInstance(){
        if(t==null) t=new TriangularShapeFactory();
        return t;
    }

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
