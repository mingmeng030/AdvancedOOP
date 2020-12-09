public class SecondOperandState extends State{
    public SecondOperandState(CalcV1 c){
        super(c);
    }
    @Override //'='이 들어왔으므로 결과 출력하고 startState로 상태 변환
    void InputOperator(char ch){
        calc.printOutResult();
        calc.setState(calc.StartState);
    }
}
