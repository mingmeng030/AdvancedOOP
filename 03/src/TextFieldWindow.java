import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class TextFieldWindow extends FrameWindow implements Observer {
    private JTextField textField;

    public TextFieldWindow(String title, int x, int y, int width, int height) {
        super(title, x, y, width, height);
    }

    public void updateText(String msg) {
        textField.setText(msg);
        textField.validate();
    }

    @Override
    public void update(int n) {
        this.updateText("" + n);
    }

    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        textField = new JTextField();
        panel.add(textField);
        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }
}