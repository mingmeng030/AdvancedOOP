import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NumberCommandButton extends CalculatorCommandButton{
    JLabel display;

    public NumberCommandButton(Calculator calculator, JLabel display, String text,
                               Dimension dimension, ActionListener listener){
        super(calculator, text, dimension, listener);
        this.display=display;
    }

    public void execute(){
        if (calculator.isOperand1Set() && calculator.isOperatorSet()) { // 첫 번째 피연산자와 연산자가 지정되었다면 두 번째 피연산자 값으로 사용
            int num2 = Integer.parseInt(getText());
            calculator.setOperand2(num2);
            display.setText("" + num2);
            calculator.setOperand2Set(true);
        }
        else {  // 첫 번째 피연산자 값 지정
            int num1 = Integer.parseInt(getText());
            display.setText("" + num1);
            calculator.setOperand1(num1);
            calculator.setOperand1Set(true);
        }
    }
}