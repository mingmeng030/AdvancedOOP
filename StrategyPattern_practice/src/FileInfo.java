import javax.print.DocFlavor;
import java.util.*;

public class FileInfo {
    String name;
    String type;
    int size;
    Date modifiedDate;

    FileInfo(String name, String type, int size, Date modifiedDate){
        this.modifiedDate=modifiedDate;
        this.name=name;
        this.type=type;
        this.size=size;
    }
    String getName(){
        return name;
    }
    String getType(){
        return type;
    }
    int getSize(){
        return size;
    }
    Date getModifiedDate(){
        return modifiedDate;
    }
    public String toString(){
        return "name"+getName()+"type"+getType()+"size"+getSize()+"date"+getModifiedDate();
    }
}
