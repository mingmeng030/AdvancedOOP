import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
//import java.imageio.*;
public class Main {
    public static void main(String[] args){
        ImageConverter IC = new ImageConverter(new GreyImageConverter());
        IC.ConvertTo();

        IC.setConvertable(new InverseImageConverter());
        IC.ConvertTo();

        IC.setConvertable(new SepiaImageConverter());
        IC.ConvertTo();
    }
}
