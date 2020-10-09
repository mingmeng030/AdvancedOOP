import javax.swing.*;
import java.awt.*;

public class WeatherDisplay extends DisplayDecorator {
    WeatherDisplay(Display display, int width, int height){
        super(display, width, height);
    }
    Display displayComponent;
    JPanel panel;
    LabelPanel labelPanel;

    @Override
    public JPanel create() {
        // 레이블을 담을 패널 생성
        panel = new JPanel();
        JPanel subpanel=displayComponent.create();
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        labelPanel = new LabelPanel();
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
        return panel;
    }

    @Override
    public void show(){
        displayComponent.show();
        labelPanel.updateText("Weather : 온도 : 20, 습도 : 60");
    }
}
