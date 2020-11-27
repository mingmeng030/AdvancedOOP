public class Midterm01 {
    public static void main(String[] args) {
        final String HOUSE = "house.png";
        final String IMAGE_FORMAT = "png";

        ImageConverter converter = new GreyImageConverter(IMAGE_FORMAT);
        converter.convert(HOUSE, "g_" + HOUSE);

        converter= new InverseImageConverter(IMAGE_FORMAT);
        converter.convert(HOUSE, "i_" + HOUSE);

        converter=new SepiaImageConverter(IMAGE_FORMAT);
        converter.convert(HOUSE, "s_" + HOUSE);
    }
}
