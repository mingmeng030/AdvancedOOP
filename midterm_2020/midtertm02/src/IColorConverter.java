import java.awt.*;
import java.util.ArrayList;

interface IColorConverter { //컴포넌트
    public ArrayList<Integer> convertTo(Color color);
    public String getType();
}
