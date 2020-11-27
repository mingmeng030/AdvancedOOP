import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class EqualCommandButton extends CalculatorCommandButton{
    JLabel display;

    public EqualCommandButton(Calculator calculator, JLabel display, String text,
                                 Dimension dimension, ActionListener listener){
        super(calculator, text, dimension, listener);
        this.display=display;
    }

    public void execute(){
        int result = 0;
        if (calculator.isOperand1Set() && calculator.isOperand2Set() && calculator.isOperatorSet()) { // 두 개 피 연산자값과 연산자가 지정되었다면
            if (calculator.getOperator() == '+') {
                result = calculator.getOperand1() + calculator.getOperand2();
            }
            else if (calculator.getOperator() == '-') {
                result = calculator.getOperand1() - calculator.getOperand2();
            }
            else if (calculator.getOperator() == '*') {
                result = calculator.getOperand1() * calculator.getOperand2();
            }
            else if (calculator.getOperator() == '/') {
                result = calculator.getOperand1() / calculator.getOperand2();
            }
        }
        display.setText("" + result);
        calculator.clearFlags();
    }
}