import java.awt.Color;

public class SepiaImageConverter extends ImageConverter {
    public Color convertTo(Color color){
        int temp=(color.getRed() + color.getGreen() + color.getBlue()) / 3;
        return new Color(230*temp/255,180*temp/255,150*temp/255);
    }
    public String getType() { return "s"; }
}