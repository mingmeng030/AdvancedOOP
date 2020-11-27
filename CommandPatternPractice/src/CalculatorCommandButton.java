import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class CalculatorCommandButton extends JButton implements Command{
    Calculator calculator;

    public CalculatorCommandButton(Calculator calculator, String text,
                                   Dimension dimension, ActionListener actionListener){
        super();
        this.calculator=calculator;

        setText(text);
        setPreferredSize(dimension);
        addActionListener(actionListener);
    }

    public abstract void execute();
}