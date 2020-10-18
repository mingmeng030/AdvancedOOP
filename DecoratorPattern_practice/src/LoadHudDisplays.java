import java.util.*;
import java.io.*;

public class LoadHudDisplays implements LoadDisplayInterface {
    String fileName;
    ArrayList<String> list;

    LoadHudDisplays(String displayFileName){
        this.fileName=displayFileName;
    }
    public ArrayList<String> load(){
        try {
            list = new ArrayList<>();
            //BufferedReader>>InputStreamReader>>FileInputStream
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
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

