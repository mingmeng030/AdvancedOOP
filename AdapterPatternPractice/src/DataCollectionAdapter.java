import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionAdapter<T> implements DataCollection<T>{
    private ArrayList<T> list;

    public DataCollectionAdapter() {
        list = new ArrayList<T>();
    }

    public boolean put(T t) {
        list.add(t);
        return true;
    }

    public T elemAt(int index) {
        if (!list.isEmpty()) { return (T) list.get(index); }
        return null;
    }

    public int length() {
        return list.size();
    }

    public Iterator createIterator() { //arraylist를 array로 만들 때는 .iterator 사용하기,,
        return this.list.iterator();
    }

}
