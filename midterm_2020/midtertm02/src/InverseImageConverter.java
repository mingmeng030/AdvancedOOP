import java.awt.Color;
import java.util.ArrayList;

public class InverseImageConverter extends ConvertDecorator{
    IColorConverter ICC;
    ArrayList<Integer> ColorList;

    InverseImageConverter(){};
    InverseImageConverter(IColorConverter ICC){
        this.ICC=ICC;
    }
    public ArrayList<Integer> convertTo(Color color){
        if(ICC!=null) {
            ColorList=ICC.convertTo(color);
            ColorList.set(0,255 - ColorList.get(0));
            ColorList.set(1,255 - ColorList.get(1));
            ColorList.set(2,255 - ColorList.get(2));
        }
        else {
            ColorList=new ArrayList<Integer>();
            ColorList.add(255 - color.getRed());
            ColorList.add(255 - color.getGreen());
            ColorList.add(255 - color.getBlue());
        }
        return ColorList;
    }

    public String getType() {
        if(ICC!=null) return "i_"+ICC.getType();
        else return "i_";
    }
}