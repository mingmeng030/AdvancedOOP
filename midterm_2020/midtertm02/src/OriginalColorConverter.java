import java.awt.Color;
import java.util.ArrayList;

public class OriginalColorConverter implements IColorConverter { //ConcreteComponent(원본 이미지)
    OriginalColorConverter(){ }
    public ArrayList<Integer> convertTo(Color color){
        ArrayList<Integer> ColorList=new ArrayList<>();
        ColorList.add(color.getRed());
        ColorList.add(color.getGreen());
        ColorList.add(color.getBlue());
        return ColorList;
    }
    public String getType(){
        return "";
    }
}
