import java.awt.*;
public class Parallelogram extends Shape{
    Parallelogram(String type, Point[] points){
        super(type, points);
    }
    double calcArea(){
        return (points[1].x-points[2].x)*(points[0].y-points[2].y);
    }
}
