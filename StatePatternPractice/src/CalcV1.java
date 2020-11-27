import java.util.Scanner;

public class CalcV1 {
//    private enum STATES { STATE_START, STATE_FIRST_OPERAND, STATE_SECOND_OPERAND, STATE_OPERATOR };
//    STATES state;

    Scanner scanner;
    String inputStr;
    int operand1; // 첫 번째 피 연산자값 저장
    int operand2; // 두 번째 피 연산자값 저장
    char operator; // 사칙 연산자 저장

    State state;
    State StartState;
    State FirstOperandState;
    State SecondOperandState;
    State OperatorState;

    void setState(State state){
        this.state=state;
    }

    CalcV1() {
        scanner = new Scanner(System.in);  // Create a Scanner object

        StartState=new StartState(this);
        FirstOperandState = new FirstOperandState(this);
        SecondOperandState = new SecondOperandState(this);
        OperatorState=new OperatorState(this);

        state = StartState;
    }

    String getInput(String s) {
        System.out.println(s);
        return scanner.next();
    }

    void printOutResult() {
        switch (operator) {
            case '+':
                System.out.printf("%d + %d = %d\n", operand1, operand2, operand1 + operand2);
                break;

            case '-':
                System.out.printf("%d - %d = %d\n", operand1, operand2, operand1 - operand2);
                break;

            case '*':
                System.out.printf("%d * %d = %d\n", operand1, operand2, operand1 * operand2);
                break;

            case '/':
                System.out.printf("%d / %d = %d\n", operand1, operand2, operand1 / operand2);
                break;
        }
    }

    boolean run() {
        inputStr = getInput("정수 또는 +,-,*,/,= 기호 중 한 개를 입력하세요");
        char ch = inputStr.charAt(0);
        if (ch == 'q' || ch == 'Q') {
            return false;
        }
        else if (ch >= '0' && ch <= '9') {
            state.InputNumber(inputStr);
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') {
            state.InputOperator(ch);
        }
        return true;
    }
}
