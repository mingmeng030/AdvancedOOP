import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class OperatorCommandButton extends CalculatorCommandButton{
    JLabel display;

    public OperatorCommandButton(Calculator calculator, JLabel display, String text,
                               Dimension dimension, ActionListener listener){
        super(calculator, text, dimension, listener);
        this.display=display;
    }

    public void execute(){
        if (calculator.isOperand1Set()) {  // 첫 번째 피연산자 값이 지정되어야만 연산자 처리 가능
            calculator.setOperatorSet(true);
            calculator.setOperator(getText().charAt(0));
        }
    }
}