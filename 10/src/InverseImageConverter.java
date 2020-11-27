import java.awt.Color;

public class InverseImageConverter extends ImageConverter{
    public String convertTo(Color color) {
        return (255 - color.getRed())+" "+(255 - color.getGreen())+" "+(255 - color.getBlue());
    }
    public String getType(){
        return "i";
    }
}