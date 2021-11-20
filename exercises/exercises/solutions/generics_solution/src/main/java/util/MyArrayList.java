package util;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList<T> implements Iterable<T>{
    private List<T> list = new ArrayList<T>();
    private int index=0;

    public final static int MAX_ELEMENTS = 10;


    public MyArrayList(){	}

    public boolean add(T item){
        if(list.size() < MAX_ELEMENTS){
            list.add(item);
            return true;
        }
        return false;
    }

    public T getItem(int index) throws IndexOutOfBoundsException{
        if(index >= list.size() || index < 0){
            throw new IndexOutOfBoundsException("Index out of MyArrayList bounds");
        }
        return list.get(index);
    }

    public void remove(int index)throws IndexOutOfBoundsException{
        if(index >= list.size() || index < 0){
            throw new IndexOutOfBoundsException("Index out of MyArrayList bounds");
        }
        list.remove(index);
    }

    public Iterator<T> iterator(){
        System.out.println("In MyArrayList iterator()");
        return list.iterator();
    }

}
