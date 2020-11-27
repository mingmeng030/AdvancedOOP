public class Midterm01 {
    public static void main(String[] args) {
        final String HOUSE = "house.png";
        final String IMAGE_FORMAT = "png";

        ImageConverter converter = new ImageConverter(IMAGE_FORMAT, new GreyImageConverter());
        converter.convert(HOUSE, "g_" + HOUSE);

        converter.setColorConverter(new InverseImageConverter());
        converter.convert(HOUSE, "i_" + HOUSE);

        converter.setColorConverter(new SepiaImageConverter());
        converter.convert(HOUSE, "s_" + HOUSE);
    }
}
