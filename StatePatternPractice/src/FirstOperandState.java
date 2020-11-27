public class FirstOperandState extends State{
    public FirstOperandState(CalcV1 c){
        super(c);
    }
    void InputNumber(String ch) {
        calc.operand1 = Integer.parseInt("" + ch); // 새로 입력된 값으로 다시 지정
    }
    void InputOperator(char ch){
        calc.setState(calc.OperatorState);
        calc.operator = ch;
    }
}
