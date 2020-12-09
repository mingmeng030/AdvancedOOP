import java.awt.Color;

public class InverseImageConverter extends ImageConverter{
    public Color convertTo(Color color){
        return new Color(255 - color.getRed(),255 - color.getGreen(),255 - color.getBlue());
    }
    public String getType(){ return "i"; }
}