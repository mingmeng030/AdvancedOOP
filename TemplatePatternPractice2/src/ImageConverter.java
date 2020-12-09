import java.awt.image.*;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public abstract class ImageConverter {
    final String HOUSE = "house.png";

    ImageConverter(){ this.ConvertTo(); }

    public abstract Color convertTo(Color color);
    public abstract String getType();

    void ConvertTo(){
        try {
            BufferedImage image = ImageIO.read(new File(HOUSE));
            Color color2;
            for(int y = 0; y < image.getHeight(); y++) {
                for(int x = 0; x < image.getWidth(); x++) {
                    Color color = new Color(image.getRGB(x, y));
                    color2=this.convertTo(color);
                    image.setRGB(x, y, color2.getRGB());
                }
            }
            ImageIO.write(image, "png", new File(this.getType()+"_" +HOUSE));
        }
        catch (IOException e) { e.printStackTrace(); }
    }
}
