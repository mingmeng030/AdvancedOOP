public abstract class State {
    public CalcV1 calc;
    public State(CalcV1 c){
        this.calc=c;
    }

    void InputNumber(String ch) { }
    void InputOperator(char ch){}
}



