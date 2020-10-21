import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.ArrayList;

public class ImageConverter {
    //이전 파일 가져와야함 ex) house.png -> i_house.png -> i_s_house.png
    final String HOUSE = "house.png";
    IColorConverter convertable;

    ImageConverter(IColorConverter convertable){
        this.convertable=convertable;
    }
    public void setConvertable(IColorConverter convertable) {
        this.convertable=convertable;
    }
    void ConvertTo(){
        try {
            BufferedImage image = ImageIO.read(new File(HOUSE));
            for(int y = 0; y < image.getHeight(); y++) {
                for(int x = 0; x < image.getWidth(); x++) {
                    Color color = new Color(image.getRGB(x, y));
                    ArrayList<Integer> colorlist=convertable.convertTo(color);
                    // 새로 만들어진 RGB 값을 (x, y)좌표 픽셀 컬러로 저장
                    int r=colorlist.get(0);
                    int g=colorlist.get(1);
                    int b=colorlist.get(2);
                    image.setRGB(x, y, new Color(r,g,b).getRGB());
                }
            }
            ImageIO.write(image, "png", new File(convertable.getType()+HOUSE));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
