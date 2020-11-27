import java.util.ArrayList;
import java.util.Scanner;

public class CalcV1 {
    State start, FirstOperator, SecondOperator, Operator, Exit;
    int operand1; // 첫 번째 피 연산자값 저장
    int operand2; // 두 번째 피 연산자값 저장
    char operator; // 사칙 연산자 저장
    Scanner scanner;
    String inputStr;

    State state;
    CalcV1() {
        scanner = new Scanner(System.in);  // Create a Scanner object
        start=new start(this);
        FirstOperator=new FirstOperator(this);
        SecondOperator=new SecondOperator(this);
        Operator=new Operator(this);
        Exit=new Exit(this);

        state = start;
    }

    String getInput(String s) {
        System.out.println(s);
        return scanner.next();
    }

    void setState(State state){
        this.state=state;
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
        if (ch == 'q' || ch == 'Q') { // q를 입력하면 프로그램 종료
            state.InputQ(inputStr);
        }
        else if (ch >= '0' && ch <= '9') { // 정수가 입력되면
            state.InputInteger(inputStr);
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') { // 연산자 처리
            state.InputEqual(inputStr);
            state.InputOperater(ch);
        }
        return true;
    }

    public State getStart() {
        return start;
    }

    public State getOperator() {
        return Operator;
    }

    public State getFirstOperator() {
        return FirstOperator;
    }

    public State getSecondOperator() {
        return SecondOperator;
    }

    public State getExit() {
        return Exit;
    }
}
