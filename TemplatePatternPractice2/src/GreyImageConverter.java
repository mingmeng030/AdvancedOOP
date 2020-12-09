import java.awt.Color;

public class GreyImageConverter extends ImageConverter {
    public Color convertTo(Color color){
        int temp=(color.getRed() + color.getGreen() + color.getBlue()) / 3;
        return new Color(temp,temp,temp);
    }
    public String getType(){ return "g"; }
}