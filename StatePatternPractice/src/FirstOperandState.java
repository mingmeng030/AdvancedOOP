public class FirstOperandState extends State{
    public FirstOperandState(CalcV1 c){ super(c); }
    @Override
    void InputNumber(String ch) { //숫자 입력했는데 또 숫자가 들어오면 새로 입력된 값으로 다시 지정
        calc.operand1 = Integer.parseInt("" + ch);
    }
    @Override//연산자 들어왔으므로 operatorState로 상태 변환
    void InputOperator(char ch){
        calc.setState(calc.OperatorState);
        calc.operator = ch;
    }
}