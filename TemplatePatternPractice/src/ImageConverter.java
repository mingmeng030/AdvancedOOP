import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageConverter {
    private IColorConverter colorConverter;
    private String imageFormat;

    public ImageConverter() {
        //colorConverter = converter;
    }

    public ImageConverter(String imageFormat) {
        this.imageFormat = imageFormat;
        //colorConverter = converter;
    }

    public ImageConverter(IColorConverter converter) {
        colorConverter = converter;
    }

    public ImageConverter(String imageFormat, IColorConverter converter) {
        this.imageFormat = imageFormat;
        colorConverter = converter;
    }

    public void setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
    }

    public void setColorConverter(IColorConverter converter) {
        colorConverter = converter;
    }

    public void convert(String srcFileName, String destFileName) {
        convert(srcFileName, destFileName, imageFormat);
    }

    public void convert(String srcFileName, String destFileName, String formatName) {
        // 전체적인 이미지 파일 입출력 과정에서 IOException이 발생할 수 있어 예외 처리 코드를 넣음
        try {
            // 이미지 파일 데이터를 메모리에 넣음
            BufferedImage image = ImageIO.read(new File(srcFileName));

            // 이미지의 각 픽셀 정보에 대해 컬러 변환을 한 후 다시 저장
            if (colorConverter != null) {
                Color newColor = null;
                for (int y = 0; y < image.getHeight(); y++) {
                    for (int x = 0; x < image.getWidth(); x++) {
                        // (x, y)에 해당되는 픽셀의 RGB 정보를 받아서 Color에 저장
                        Color color = new Color(image.getRGB(x, y));
                        // RGB 값을 각각 읽어서 컬러 변환
                        newColor = colorConverter.convert(color);
                        // 새로 만들어진 RGB 값을 (x, y)좌표 픽셀 컬러로 저장
                        image.setRGB(x, y, newColor.getRGB());
                    }
                }
            }
            ImageIO.write(image, formatName, new File(destFileName));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
