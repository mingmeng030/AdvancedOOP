public class SecondOperandState extends State{
    public SecondOperandState(CalcV1 c){
        super(c);
    }

    void InputOperator(char ch){
        calc.printOutResult();
        calc.setState(calc.StartState);
    }
}
