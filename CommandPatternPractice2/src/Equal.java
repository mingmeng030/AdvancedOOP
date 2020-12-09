import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class Equal extends CommandButton{
    JLabel display;

    public Equal(Calculator calculator, JLabel display, String text, Dimension dimension, ActionListener listener){
        super(calculator, text, dimension, listener);
        this.display=display;
    }
    public void execute() {
        int result = 0;
        if (calc.isOperand1Set() && calc.isOperand2Set() && calc.isOperatorSet()) { // 두 개 피 연산자값과 연산자가 지정되었다면
            if (calc.getOperator() == '+') {
                result = calc.getOperand1() + calc.getOperand2();
            }
            else if (calc.getOperator() == '-') {
                result = calc.getOperand1() - calc.getOperand2();
            }
            else if (calc.getOperator() == '*') {
                result = calc.getOperand1() * calc.getOperand2();
            }
            else if (calc.getOperator() == '/') {
                result = calc.getOperand1() / calc.getOperand2();
            }
        }
        display.setText("" + result);
        calc.clearFlags();
    }
}