import java.awt.*;
public class Rectangle extends Shape {
    Rectangle(String type, Point[] points){
        super(type, points);
    }
    double calcArea(){
        return (points[0].y-points[1].y)*(points[1].x-points[0].x);
    }
}