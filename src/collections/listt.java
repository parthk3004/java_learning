package collections;

import java.util.ArrayList;
import java.util.List;

public class listt<T> {
    List<T> list = new ArrayList<>();
    public void addObjects(T object) {
        list.add(object);
        }
        public List<T> getObject(){
            return this.list;
        }
    }