import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.ArrayList;

//import java.imageio.*;
public class Main { //Strategy(알고리즘 전체를 인터페이스로) -> Decorator -> Template(알고리즘 일부를 인터페이스로)
    public static void main(String[] args){
        ImageConverter IC =new GreyImageConverter();
        IC=new InverseImageConverter();
        IC=new SepiaImageConverter();
    }
}