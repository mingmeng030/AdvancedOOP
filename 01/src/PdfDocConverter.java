public class PdfDocConverter extends DocConverter{

    public PdfDocConverter() {
        super("pdf");
    }

    public void save(String fileName){
        System.out.println(fileName+"."+getExtension()+"로 변환해서 저장합니다.");
    }

}