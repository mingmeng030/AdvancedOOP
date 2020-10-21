import java.awt.Color;
import java.util.ArrayList;

public class InverseImageConverter implements Convertable{
    public ArrayList<Integer> convertTo(Color color){
        ArrayList<Integer> ColorList=new ArrayList<>();
        ColorList.add(255 - color.getRed());
        ColorList.add(255 - color.getGreen());
        ColorList.add(255 - color.getBlue());
        return ColorList;
    }
    public String getType(){
        return "i";
    }
}