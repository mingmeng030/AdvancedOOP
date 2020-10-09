import java.awt.*;
import java.math.*;
public class Triangle extends Shape {
    Triangle(String type, Point[] points){
        super(type, points);
    }
    double calcArea() {
        double a=distance(points[0],points[1]);
        double b=distance(points[1],points[2]);
        double c=distance(points[2],points[0]);
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    private double distance(Point p1, Point p2){
        double a=Math.pow(p1.x-p2.x,2);
        double b=Math.pow(p1.y-p2.y,2);
        double distance=Math.sqrt(a+b);
        return distance;
    }
}
