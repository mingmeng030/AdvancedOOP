import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sorter {
    Comparable compare;

    Sorter(Comparable comparable){
        this.compare=comparable;
    }

    void setComparable(Comparable comparable){
        this.compare=comparable;
    }

    public void bubbleSort(FileInfo[] fileLists) {
        for (int i = 0; i < fileLists.length - 1; i++) {
            for (int j = 0; j < fileLists.length - i - 1; j++) {
                if (compare.compareTo(fileLists[j],fileLists[j+1])>0) { // swap
                    FileInfo temp = fileLists[j];
                    fileLists[j] = fileLists[j + 1];
                    fileLists[j + 1] = temp;
                }
            }
        }
    }
}