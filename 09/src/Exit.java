public class Exit implements State{
    CalcV1 C;
    Exit(CalcV1 C){
        this.C=C;
    }
    public void InputInteger(String s){ }
    public void InputOperater(char c){ }
    public void InputEqual(String s){ }
    public void InputQ(String s){
        System.exit(0);
    }
}
