import java.awt.Color;
import java.util.ArrayList;
public class GreyImageConverter implements Convertable {
    public ArrayList<Integer> convertTo(Color color) {
        ArrayList<Integer> ColorList=new ArrayList<>();
        ColorList.add((color.getRed() + color.getGreen() + color.getBlue()) / 3);
        ColorList.add((color.getRed() + color.getGreen() + color.getBlue()) / 3);
        ColorList.add((color.getRed() + color.getGreen() + color.getBlue()) / 3);
        return ColorList;
    }
    public String getType(){
        return "g";
    }
}