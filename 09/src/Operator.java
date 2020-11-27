public class Operator implements State{
    CalcV1 C;
    Operator(CalcV1 C){
        this.C=C;
    }
    public void InputInteger(String s){
        this.InputQ(s);
        C.operand2 = Integer.parseInt("" + s);
        C.setState(C.getSecondOperator());
    }
    public void InputOperater(char c){ }
    public void InputEqual(String s){ }
    public void InputQ(String s){
        if (s == "q" || s == "Q") { // q를 입력하면 프로그램 종료
            C.setState(C.getExit());
        }
    }
}
