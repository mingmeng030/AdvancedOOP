import java.awt.Color;
public class GreyImageConverter extends ImageConverter {
    public String convertTo(Color color) {
        int grey = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
        return grey+" "+grey+" "+grey;
    }
    public String getType(){
        return "g";
    }
}