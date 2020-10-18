import javax.swing.*;
import java.awt.*;
import java.util.Date;
public class TimeDisplay extends DisplayDecorator{
    Display displayComponent;
    LabelPanel labelPanel;
    TimeDisplay(Display display, int width, int height) {
        super(display, width, height);
        displayComponent=display;
        labelPanel=new LabelPanel();
    }
    @Override
    public int getHeight() {
        return displayComponent.getHeight() + super.getHeight();
    }

    @Override
    public JPanel create() {
        JPanel panel=new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel subPanel = displayComponent.create();
        panel.add(subPanel);
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        return panel;
    }

    @Override
    public void show() {
        displayComponent.show();
        Date date = new Date();
        labelPanel.updateText("Date: " + date.toString());
    }
}
