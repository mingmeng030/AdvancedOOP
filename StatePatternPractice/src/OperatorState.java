public class OperatorState extends State{
    public OperatorState(CalcV1 c){
        super(c);
    }
    @Override //두번째 피연산자가 들어왔으므로 SecondOperandState로 상태 변환
    void InputNumber(String ch) {
        calc.operand2 = Integer.parseInt("" + ch);
        calc.setState(calc.SecondOperandState);
    }

}
