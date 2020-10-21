import sun.awt.image.IntegerComponentRaster;

import java.awt.Color;
import java.util.ArrayList;
//import java.imageio.*;

public class SepiaImageConverter extends ConvertDecorator{
    IColorConverter ICC;
    ArrayList<Integer> ColorList;

    SepiaImageConverter(){};
    SepiaImageConverter(IColorConverter ICC){
        this.ICC=ICC;
    }
    public ArrayList<Integer> convertTo(Color color){
        int grey;
        if(ICC!=null) {
            ColorList=ICC.convertTo(color);
            grey = (ColorList.get(0) + ColorList.get(0) + ColorList.get(0)) / 3;
            ColorList.set(0,230 * grey / 255);
            ColorList.set(1,180 * grey / 255);
            ColorList.set(2,150 * grey / 255);
        }
        else {
            ColorList=new ArrayList<Integer>();
            grey = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
            ColorList.add(230 * grey / 255);
            ColorList.add(180 * grey / 255);
            ColorList.add(150 * grey / 255);
        }

        return ColorList;
    }

    public String getType() {
        if(ICC!=null) return "s_"+ICC.getType();
        else return "s_";
    }
}