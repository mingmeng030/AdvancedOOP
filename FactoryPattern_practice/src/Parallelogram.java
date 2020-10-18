import java.awt.*;
public class Parallelogram extends Shape {
    Parallelogram(String type, Point[] points){
        super(type, points);
    }
    double calcArea(){
        double h=(points[0].y-points[2].y);
        return (points[3].x-points[0].x)*h;
    }
}
