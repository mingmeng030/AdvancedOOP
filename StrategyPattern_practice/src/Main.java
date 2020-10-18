import java.text.ParsePosition;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    String[] names = { "CompareModifiedDate", "CompareFileType", "CompareFileName", "Main", "CompareSize"  };
    String[] types = { "java", "java", "class", "java", "Class" };
    int[] sizes = { 120, 80, 150, 85, 100 };
    String[] dateStrings = { "2020-09-13T21:59:00", "2020-09-12T21:59:00",
            "2020-09-13T16:54:00", "2020-09-12T21:54:00", "2020-09-13T11:59:00" };

    public FileInfo[] createFileInfoArrays() {
        FileInfo[] fileLists = new FileInfo[names.length];
        SimpleDateFormat dateTimeInstance = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        for (int i = 0; i < fileLists.length; i++) {
            Date date = dateTimeInstance.parse(dateStrings[i], new ParsePosition(0));
            fileLists[i] = new FileInfo(names[i], types[i], sizes[i], date);
        }
        return fileLists;
    }

    public void printFileLists(FileInfo[] fileLists) {
        for (FileInfo fi : fileLists) {
            System.out.println(fi);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        FileInfo[] fileLists = m.createFileInfoArrays();
        System.out.println("원본 리스트");
        m.printFileLists(fileLists);

        Sorter bubblesort = new Sorter(new CompareFileName());
        System.out.println("\n\n파일 이름으로 정렬된 리스트");
        bubblesort.bubbleSort(fileLists);
        m.printFileLists(fileLists);

        System.out.println("\n\n파일 종류로 정렬된 리스트");
        bubblesort.setComparable(new CompareFileType());
        bubblesort.bubbleSort(fileLists);
        m.printFileLists(fileLists);

        System.out.println("\n\n파일 크기로 정렬된 리스트");
        bubblesort.setComparable(new CompareSize());
        bubblesort.bubbleSort(fileLists);
        m.printFileLists(fileLists);

        System.out.println("\n\n파일 수정 시간으로 정렬된 리스트");
        bubblesort.setComparable(new CompareModifiedDate());
        bubblesort.bubbleSort(fileLists);
        m.printFileLists(fileLists);
    }
}

//
//import java.text.ParsePosition;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class Main {
//    public static Date[] createDateArray(String[] dateStrings) {
//        SimpleDateFormat dateTimeInstance = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//        Date[] dates = new Date[dateStrings.length];
//        for (int i = 0; i < dateStrings.length; i++) {
//            dates[i] = dateTimeInstance.parse(dateStrings[i], new ParsePosition(0));
//        }
//        return dates;
//    }
//
//    public static void main(String[] args) {
//        int[] data = { 1, 3, 7, 5, 6, 4, 10, 8 };
//        String[] data2 = { "hello", "hello1", "world1", "world", "new", "next" };
//        String[] dateStrings = { "2020-09-13T21:59:00", "2020-09-12T21:59:00",
//                "2020-09-13T16:54:00", "2020-09-12T21:54:00", "2020-09-13T11:59:00" };
//
//        Date[] dates = Main.createDateArray(dateStrings);
//        Sorter si = new Sorter();
//        //si.bubbleSortInts();
//        si.bubbleSortInts(data);
//        si.printInts(data);
//        si.bubbleSortStrings(data2);
//        si.printStrings(data2);
//        si.bubbleSortDates(dates);
//        si.printDates(dates);
//    }
//}
