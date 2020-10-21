import java.util.ArrayList;
import java.awt.Color;
interface Convertable {
    ArrayList<Integer> convertTo(Color color);
    String getType();
}