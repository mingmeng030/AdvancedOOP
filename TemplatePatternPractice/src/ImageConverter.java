import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class ImageConverter {
    private String imageFormat;

    public ImageConverter() { }
    public ImageConverter(String imageFormat) {
        this.imageFormat = imageFormat;
    }

    public abstract Color convert(Color c);

    public void convert(String srcFileName, String destFileName) {
        convert(srcFileName, destFileName, imageFormat);
    }

    public void convert(String srcFileName, String destFileName, String formatName) {
        try {
            BufferedImage image = ImageIO.read(new File(srcFileName));

                Color newColor = null;
                for (int y = 0; y < image.getHeight(); y++) {
                    for (int x = 0; x < image.getWidth(); x++) {
                        Color color = new Color(image.getRGB(x, y));
                        newColor = convert(color);
                        image.setRGB(x, y, newColor.getRGB());
                    }
                }
            ImageIO.write(image, formatName, new File(destFileName));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
