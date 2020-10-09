import java.awt.*;
public class RightTriangle extends Shape {
    RightTriangle(String type, Point[] points){
        super(type, points);
    }
    double calcArea() {
        return (points[2].x-points[1].x)*(points[0].y-points[2].y)/2.0d;
    }
}
