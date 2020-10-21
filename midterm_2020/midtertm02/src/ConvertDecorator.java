import java.awt.*;
import java.util.ArrayList;

public abstract class ConvertDecorator implements IColorConverter{ //데코레이터
    public abstract ArrayList<Integer> convertTo(Color color);
}