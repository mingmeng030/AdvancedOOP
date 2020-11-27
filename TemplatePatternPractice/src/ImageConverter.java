import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class ImageConverter {
//    private IColorConverter colorConverter;
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
                        // (x, y)에 해당되는 픽셀의 RGB 정보를 받아서 Color에 저장
                        Color color = new Color(image.getRGB(x, y));
                        // RGB 값을 각각 읽어서 컬러 변환
                        newColor = convert(color);
                        // 새로 만들어진 RGB 값을 (x, y)좌표 픽셀 컬러로 저장
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
