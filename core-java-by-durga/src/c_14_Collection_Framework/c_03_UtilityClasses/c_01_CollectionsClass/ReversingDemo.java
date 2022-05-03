package c_14_Collection_Framework.c_03_UtilityClasses.c_01_CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator3 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1= (Integer) o1;
        Integer i2= (Integer) o2;
        return i2.compareTo(i1);
    }
}

public class ReversingDemo {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);
        System.out.println(l); // [15, 0, 20, 10, 5]
        Collections.reverse(l);
        System.out.println(l); // [5, 10, 20, 0, 15]
        Collections.sort(l,new MyComparator3());
        System.out.println(l); // [20, 15, 10, 5, 0]

        Comparator c = Collections.reverseOrder(new MyComparator3());
        System.out.println(l); // [20, 15, 10, 5, 0]
        Collections.sort(l,c);
        System.out.println(l); // [0, 5, 10, 15, 20]



    }
}
