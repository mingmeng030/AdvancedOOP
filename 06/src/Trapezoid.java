import java.awt.*;
public class Trapezoid extends Shape {
    Trapezoid(String type, Point[] points){
        super(type, points);
    }
    double calcArea(){
        return ((points[1].x-points[2].x)+(points[3].x-points[0].x))
                *(points[0].y-points[2].y)/2;
    }
}
