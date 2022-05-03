package c_15_Concurrent_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList list=new CopyOnWriteArrayList();
       // ArrayList list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list); // [A, B, C, D]
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            if(s.equals("A"))
                iterator.remove(); // remove operation not allow CopyOnWriteArrayList
        }
        System.out.println(list); // if ArrayList ==> [B, C, D]
    }
}
