package c_14_Collection_Framework.c_01_Collection.c_04_TypesOfCursor;

import java.util.ArrayList;
import java.util.Iterator;

// it is applicable for any collection object
// we can also perform remove operation
// we can't perform backward direction we can perform only forward direction

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        for (int i = 0; i <= 10; i++) {
            l.add(i);
        }
        System.out.println(l);
        Iterator itr = l.iterator();
        while (itr.hasNext()){
            Integer I = (Integer) itr.next();
            if (I%2==0)
                System.out.println(I);
            else
                itr.remove();
        }
        System.out.println(l);
    }
}
