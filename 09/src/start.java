public class start implements State{
    CalcV1 C;
    start(CalcV1 C){
        this.C=C;
    }
    public void InputInteger(String s){
        this.InputQ(s);
        C.operand1 = Integer.parseInt("" + s);
        C.setState(C.getFirstOperator());

    }
    public void InputOperater(char c){ }
    public void InputEqual(String s){ }
    public void InputQ(String s){
        if (s == "q" || s == "Q") { // q를 입력하면 프로그램 종료
            C.setState(C.getExit());
        }
    }
}


