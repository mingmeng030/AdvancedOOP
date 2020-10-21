import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.ArrayList;

public class ImageConverter {
    final String HOUSE = "house.png";
    Convertable convert;

    ImageConverter(Convertable convertable){
        this.convert=convertable;
    }
    public void setConvertable(Convertable convertable) {
        convert=convertable;
    }
    void ConvertTo(){
        try {
            BufferedImage image = ImageIO.read(new File(HOUSE));

            for(int y = 0; y < image.getHeight(); y++) {
                for(int x = 0; x < image.getWidth(); x++) {
                    Color color = new Color(image.getRGB(x, y));
                    ArrayList<Integer> colorlist=convert.convertTo(color);
                    // 새로 만들어진 RGB 값을 (x, y)좌표 픽셀 컬러로 저장
                    int r=colorlist.get(0);
                    int g=colorlist.get(1);
                    int b=colorlist.get(2);
                    image.setRGB(x, y, new Color(r,g,b).getRGB());
                }
            }
            ImageIO.write(image, "png", new File(convert.getType()+"_" +HOUSE));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
