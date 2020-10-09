import java.util.ArrayList;
import java.io.*;

//파일로부터 자료를 읽어서 각 줄의 디스플레이 이름을 요소로 취하는 문자열 리스트 구성
//문자로 arraylist 만들고 그거 자체를 반환하기
public class LoadHudDisplays implements LoadDisplayInterface{
    String filename;
    ArrayList<String> list;

    LoadHudDisplays(String fileName){
        this.filename=fileName;
    }
    public ArrayList<String> load(){
        try {
            list = new ArrayList<>();
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            String s = br.readLine();
            while (s != null) {
                list.add(s);
                s = br.readLine();
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
