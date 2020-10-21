import java.awt.Color;
import java.util.ArrayList;
//import java.imageio.*;

public class SepiaImageConverter implements Convertable {
    public ArrayList<Integer> convertTo(Color color){
        ArrayList<Integer> ColorList=new ArrayList<>();
        int grey = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
        ColorList.add(230 * grey / 255);
        ColorList.add(180 * grey / 255);
        ColorList.add(150 * grey / 255);
        return ColorList;
    }
    public String getType() {
        return "s";
    }
}