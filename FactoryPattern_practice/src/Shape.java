import java.awt.*;

public abstract class Shape {
    Point [] points;
    String type;

    Shape(String type, Point[] points){
        this.type=type;
        this.points=points;
    }

    abstract double calcArea();

    public String toString(){
        String s="type : "+type+'\n';
        if(type=="Rectangle")
            s+=" p0 = " + points[0].toString() + '\n' +
                " p1 = " + points[1].toString() + '\n';
        else if(type=="Triangle"||type=="RightTriangle")
            s+=" p0 = " + points[0].toString() + '\n' +
               " p1 = " + points[1].toString() + '\n' +
               " p2 = " + points[2].toString() + '\n';
        else
            s+=" p0 = " + points[0].toString() + '\n' +
               " p1 = " + points[1].toString() + '\n' +
               " p2 = " + points[2].toString() + '\n' +
               " p3 = " + points[3].toString() + '\n';
        return s+=" area : " + calcArea()+ '\n';
    }
}
