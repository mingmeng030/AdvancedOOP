import java.awt.*;
public class RectangularShapeFactory implements ShapeFactory {
    //    //<SingletonPattern>
    //    private static RectangularShapeFactory t;
    //    public static RectangularShapeFactory getInstance(){
    //        if(t==null){
    //            t=new RectangularShapeFactory();
    //        }
    //        return t;
    //    }
    public Shape create(String type, Point[] points){
        Shape s;
        if(type=="Rectangle") s=new Rectangle(type,points);
        else if(type=="Trapezoid") s=new Trapezoid(type,points);
        else if(type=="Parallelogram") s=new Parallelogram(type,points);
        else {
            System.out.println("there's no triangle with that type");
            return null;
        }
        return s;
    }
}
