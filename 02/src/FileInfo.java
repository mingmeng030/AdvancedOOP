import java.util.*;
import java.lang.*;

public class FileInfo {
    String name;
    String type;
    int size;
    Date modifiedDate;

    FileInfo(String name, String type, int size, Date modifiedDate){
        this.name=name;
        this.type=type;
        this.size=size;
        this.modifiedDate=modifiedDate;
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

    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nSize: " + size + "\nModifiedDate: " + modifiedDate;
    }
}