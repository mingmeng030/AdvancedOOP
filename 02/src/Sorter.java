public class Sorter {
    Comparable compare;

    //맨 처음 초기화 할 때 사용 / comparable 에는 Commpare뫄뫄 객체가 들어간다.
    public Sorter(Comparable comparable) {
        this.compare = comparable;
    }

    //두 번째부터 초기화 할 때는 setComparable을 사용한다.
    public void setComparable(Comparable comparable) {
        compare = comparable;
    }
    public void bubbleSort(Object[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (compare.compareTo(data[j], data[j + 1]) > 0) { // swap
                    Object temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}
