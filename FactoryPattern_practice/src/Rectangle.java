import java.awt.*;
public class Rectangle extends Shape {
    Rectangle(String type, Point[] points){
        super(type, points);
    }
    double calcArea(){
        double h=(points[0].y-points[1].y);
        double w=(points[1].x-points[0].x);
        return w*h;
    }
}
