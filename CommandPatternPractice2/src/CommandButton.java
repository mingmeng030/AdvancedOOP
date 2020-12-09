import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class CommandButton extends JButton{
    Calculator calc;

    public CommandButton(Calculator calculator, String text, Dimension dimension, ActionListener actionListener){
        super();
        this.calc=calculator;

        setText(text);
        setPreferredSize(dimension);
        addActionListener(actionListener);
    }

    public abstract void execute();
}