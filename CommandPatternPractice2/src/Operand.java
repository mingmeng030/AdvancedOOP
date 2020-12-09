import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Operand extends CommandButton{
    JLabel display;

    public Operand(Calculator calculator, JLabel display, String text, Dimension dimension, ActionListener listener){
        super(calculator, text, dimension, listener);
        this.display=display;
    }
    public void execute(){
        if (calc.isOperand1Set() && calc.isOperatorSet()) { // 첫 번째 피연산자와 연산자가 지정되었다면 두 번째 피연산자 값으로 사용
            int num2 = Integer.parseInt(getText());
            calc.setOperand2(num2);
            display.setText("" + num2);
            calc.setOperand2Set(true);
        }
        else {  // 첫 번째 피연산자 값 지정
            int num1 = Integer.parseInt(getText());
            display.setText("" + num1);
            calc.setOperand1(num1);
            calc.setOperand1Set(true);
        }
    }
}