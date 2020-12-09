import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Operator extends CommandButton{
    JLabel display;

    public Operator(Calculator calculator, JLabel display, String text, Dimension dimension, ActionListener listener){
        super(calculator, text, dimension, listener);
        this.display=display;
    }
    public void execute(){
        if (calc.isOperand1Set()) {  // 첫 번째 피연산자 값이 지정되어야만 연산자 처리 가능
            calc.setOperatorSet(true);
            calc.setOperator(getText().charAt(0));
        }
    }

}
