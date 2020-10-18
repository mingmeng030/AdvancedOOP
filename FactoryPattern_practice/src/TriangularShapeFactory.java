import java.awt.*;
public class TriangularShapeFactory implements ShapeFactory {

//    //<SingletonPattern>
//    private static TriangularShapeFactory t;
//    public static TriangularShapeFactory getInstance(){
//        if(t==null){
//            t=new TriangularShapeFactory();
//        }
//        return t;
//    }

    public Shape create(String type, Point[] points){
        Shape s;
        if(type=="Triangle") s=new Triangle(type,points);
        else if(type=="RightTriangle") s=new RightTriangle(type,points);
        else {
            System.out.println("there's no triangle with that type");
            return null;
        }
        return s;
    }
}