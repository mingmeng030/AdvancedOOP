import java.awt.Color;
import java.util.ArrayList;
public class GreyImageConverter extends ConvertDecorator{
    IColorConverter ICC;
    ArrayList<Integer> ColorList;

    GreyImageConverter(){};
    GreyImageConverter(IColorConverter ICC){
        this.ICC=ICC;
    }
    public ArrayList<Integer> convertTo(Color color) {
        if(ICC!=null) {
            ColorList=ICC.convertTo(color);
            ColorList.set(0,(ColorList.get(0) + ColorList.get(1) + ColorList.get(2)) / 3);
            ColorList.set(1,(ColorList.get(0) + ColorList.get(1) + ColorList.get(2)) / 3);
            ColorList.set(2,(ColorList.get(0) + ColorList.get(1) + ColorList.get(2)) / 3);
        }
        else {
            ColorList=new ArrayList<Integer>();
            ColorList.add((color.getRed() + color.getGreen() + color.getBlue()) / 3);
            ColorList.add((color.getRed() + color.getGreen() + color.getBlue()) / 3);
            ColorList.add((color.getRed() + color.getGreen() + color.getBlue()) / 3);
        }
        return ColorList;
    }
    public String getType() {
        if(ICC!=null) return "g_"+ICC.getType();
        else return "g_";
    }
}