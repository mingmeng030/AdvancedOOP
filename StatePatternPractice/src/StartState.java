public class StartState extends State{
    public StartState(CalcV1 c){
        super(c);
    }

    public void InputNumber(String ch) {
        calc.operand1 = Integer.parseInt("" + ch);
        calc.setState(calc.FirstOperandState);
    }
}