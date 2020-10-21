import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
//import java.imageio.*;
public class Main {
    //성적공개용 닉네임 : mochalatte
    public static void main(String[] args){
        ImageConverter IC = new ImageConverter(new GreyImageConverter());
        IC.ConvertTo();

        IC.setConvertable(new InverseImageConverter());
        IC.ConvertTo();

        IC.setConvertable(new SepiaImageConverter());
        IC.ConvertTo();


        IColorConverter ICC= new OriginalColorConverter();
        ICC=new GreyImageConverter(ICC);
        ICC=new InverseImageConverter(ICC);
        IC.setConvertable(ICC);
        IC.ConvertTo();

        ICC= new OriginalColorConverter();
        ICC = new SepiaImageConverter(ICC);
        ICC = new InverseImageConverter(ICC);
        IC.setConvertable(ICC);
        IC.ConvertTo();

        ICC= new OriginalColorConverter();
        ICC = new InverseImageConverter(ICC);
        ICC = new SepiaImageConverter(ICC);
        IC.setConvertable(ICC);
        IC.ConvertTo();
    }
}
