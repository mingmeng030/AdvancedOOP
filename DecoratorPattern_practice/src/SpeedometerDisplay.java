import javax.swing.*;
import java.awt.*;

public class SpeedometerDisplay extends DisplayDecorator {
    Display displayComponent;
    JPanel panel;
    LabelPanel labelPanel;

    SpeedometerDisplay(Display display, int width, int height){
        super(display, width, height);
    }

    @Override
    public int getHeight() {
        return displayComponent.getHeight() + super.getHeight();
    }


    @Override
    public JPanel create() {
        // 레이블을 담을 패널 생성
        panel = new JPanel();
        JPanel subPanel = displayComponent.create();

        panel.add(subPanel);
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));

        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        return panel;
    }

    @Override
    public void show(){
        displayComponent.show();
        labelPanel.updateText("Speed: 50");
    }
}
