import java.awt.Color;

public class SepiaImageConverter extends ImageConverter {
    public String convertTo(Color color) {
        int grey = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
        return 230 * grey / 255+" "+180 * grey / 255+" "+150 * grey / 255;
    }
    public String getType() {
        return "s";
    }
}