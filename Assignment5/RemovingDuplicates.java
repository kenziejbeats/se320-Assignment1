package Assignment5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemovingDuplicates {
    public static void removeDuplicates(List lst) {
        if (lst == null){
            throw new IllegalArgumentException("Input list cannot be null.");
        }

        if (lst.size() <= 1){
            return;
        }

        List copy = new ArrayList(lst);
        Iterator elements = copy.iterator();
        Object pre = elements.next();
        while (elements.hasNext()){
            Object nex = elements.next();
            if (pre.equals(nex)){
                lst.remove(nex);
            } else {
                pre = nex;
            }
        }

        
    }
}

