import java.awt.*;
public class RightTriangle extends Shape{
    RightTriangle(String type, Point[] points){
        super(type,points);
    }
    double calcArea(){
        double h=(points[0].y-points[2].y);
        return (points[2].x-points[1].x)*h/2;
    }
}
