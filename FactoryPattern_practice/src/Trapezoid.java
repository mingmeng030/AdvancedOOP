import java.awt.*;
public class Trapezoid extends Shape {
    Trapezoid(String type, Point[] points){
        super(type, points);
    }
    double calcArea(){
        double h=points[0].y-points[1].y;
        double uw=points[3].x-points[0].x;
        double dw=points[1].x-points[2].x;
        return (uw+dw)*h/2;
    }
}