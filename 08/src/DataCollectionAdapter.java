import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionAdapter<T> implements DataCollection<T>{
    private ArrayList<T> data;

    public DataCollectionAdapter() {
        data=new ArrayList<T>();
    }

    public boolean put(T t) {
        data.add(t);
        return true;
    }

    public T elemAt(int index) {
        if (index >= 0 && index < data.size()) return (T) data.get(index);
        return null;
    }

    public int length() {
        return data.size();
    }

    public Iterator createIterator() {
        return this.data.iterator(); //Arraylist를 iterator로 바꾸려면 .iterator() 만 쓰면 됨.
    }

}
