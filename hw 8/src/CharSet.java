import java.util.HashSet;
import java.util.Set;

import java.util.*;

public class CharSet {
    Set<String> a = new HashSet<String>();

    public CharSet(String[] arr){
        for(String entry:arr){
            a.add(entry);
        }
    }

    public CharSet(){}

    public boolean add(String inp){ //добавление в а
        return a.add(inp);
    }

    public boolean delete_elem(String inp){ //удаление из а
        return a.remove(inp);
    }

    public int getIndex(String value) { //индекс элемента
        int result = 0;
        for (String entry:a) {
            if (entry.equals(value)) return result;
            result++;
        }
        return -1;
    }

    public boolean is_in(String inp){ //есть ли такой объект в множестве а
        return a.contains(inp);
    }

    public Set<String> set_union(Set<String> b){ //объединение а с б
        Set<String> union = new HashSet<String>(a);
        union.addAll(b);
        return union;
    }

    public Set<String> set_intersection(Set<String> b){ //пересечение а и б
        Set<String> intersection = new HashSet<String>(a);
        intersection.retainAll(b);
        return intersection;
    }

    public Set<String> set_symmdiff(Set<String> b){ //разница а и б
        Set<String> symmdiff = new HashSet<String>(a);
        symmdiff.removeAll(b);
        return symmdiff;
    }
}
