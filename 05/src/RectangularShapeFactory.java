import java.awt.*;
public class RectangularShapeFactory implements ShapeFactory {
    @Override
    public Shape create(String type, Point[] points) {
        Shape s;
        if(type=="Rectangle"){
            s=new Rectangle(type, points);
            return s;
        }
        else if(type=="Parallelogram"){
            s=new Parallelogram(type, points);
            return s;
        }
        else if(type=="Trapezoid"){
            s=new Trapezoid(type, points);
            return s;
        }
        else{
            System.out.println("there's no rectangular with that type");
            return null;
        }
    }
}
