public class OperatorState extends State{
    public OperatorState(CalcV1 c){
        super(c);
    }

    void InputNumber(String ch) {
        calc.operand2 = Integer.parseInt("" + ch);
        calc.setState(calc.SecondOperandState);
    }

}
