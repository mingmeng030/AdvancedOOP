import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.ArrayList;

public abstract class ImageConverter {
    ImageConverter(){
        //새로운 converter로 바뀌어 생성자 실행하면 ConvertTo 함수 자동 실행->내부에서 convertTo 작동->각 converter의 convertTo작동
        ConvertTo();
    }
    final String HOUSE = "house.png";

    public String [] getList(String list){ //일부 구현
        String s[] = list.split(" "); //문자열을 띄어쓰기를 기준으로 split 하여 배열에 저장
        return s;
    }
    public abstract String convertTo(Color color); //뼈대만 잡은 부분
    public abstract String getType();

    public void ConvertTo(){//함수 내부 자체가 template method
        String list;
        String[] result;
        try {
            BufferedImage image = ImageIO.read(new File(HOUSE));
            for(int y = 0; y < image.getHeight(); y++) {
                for(int x = 0; x < image.getWidth(); x++) {
                    Color color = new Color(image.getRGB(x, y));
                    list=this.convertTo(color);  // 새로 만들어진 RGB 값을 (x, y)좌표 픽셀 컬러로 바꾸고 문자열로 저장
                    result=this.getList(list); //저장한 문자열 공백을 기준으로 split -> 문자열을 배열로 만들기
                    image.setRGB(x, y, new Color(Integer.parseInt(result[0]),Integer.parseInt(result[1]),Integer.parseInt(result[2])).getRGB());
                }
            }
            ImageIO.write(image, "png", new File(this.getType()+"_" +HOUSE));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
