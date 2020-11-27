public class SecondOperator implements State {
    CalcV1 C;
    SecondOperator(CalcV1 C){
        this.C=C;
    }
    public void InputInteger(String s){ }
    public void InputOperater(char c){ }
    public void InputEqual(String s){
        this.InputQ(s);
        C.printOutResult();
        C.setState(C.getStart());
    }
    public void InputQ(String s){
        if (s == "q" || s == "Q") { // q를 입력하면 프로그램 종료
            C.setState(C.getExit());
        }
    }
}