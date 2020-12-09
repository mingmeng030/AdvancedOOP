import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrimeObservableThread implements Runnable, Subject{
    private static final int SLEEPTIME = 500;
    ArrayList<Observer> list;

    private int primeNumber;
    private int numCount;
    private boolean first = true;
    private boolean stopRunning = false;

    public PrimeObservableThread() { list=new ArrayList<Observer>(); }

    public int getPrimeNumber() {
        return primeNumber;
    }
    public void startRunning() {
        stopRunning = false;
        run();
    }

    public void stopRunning() {
        stopRunning = true;
    }

    @Override //runnable
    public void run() {
        generatePrimeNumber();
    }

    private void generatePrimeNumber() {
        while (stopRunning == false) {
            if (first) { //맨 처음에만 if문 실행
                first = false;
                primeNumber = 2;   // 첫 번째 소수는 2
                System.out.println(primeNumber);
                notifyObservers();
                numCount = 1; // 다음 단계부터는 2를 더해서 홀수만 확인하므로 1로 바꿔서 다음 숫자를 3으로 만들어야 함
            } else {
                numCount += 2; // 2를 제외한 짝수는 소수가 될 수 없음. 따라서 홀수만 검사
                if (isPrimeNumber(numCount)) {
                    primeNumber = numCount;
                    System.out.println(primeNumber);
                    notifyObservers();
                }
            }
            try {
                Thread.sleep(SLEEPTIME); // 1초 쉼
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrimeNumber(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void addObservers(Observer o){ list.add(o); }
    @Override
    public void removeObservers(Observer o){
        list.remove(o);
    }
    @Override// button 클릭->소수 생성하여 소수 발견하면 observer에 notify->observer는 객체에 소수 update
    public void notifyObservers(){
        for(Observer o : list){
            o.update(primeNumber);
        }

    }
}
