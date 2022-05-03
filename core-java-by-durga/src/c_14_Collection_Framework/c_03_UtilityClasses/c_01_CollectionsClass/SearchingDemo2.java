package c_14_Collection_Framework.c_03_UtilityClasses.c_01_CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator2 implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1= (Integer) o1;
        Integer i2= (Integer) o2;
        return i2.compareTo(i1);
    }
}

public class SearchingDemo2 {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);
        System.out.println(l); // [15, 0, 20, 10, 5]
        Collections.sort(l,new MyComparator2());
        System.out.println(l); // [20, 15, 10, 5, 0]

        System.out.println(Collections.binarySearch(l,10,new MyComparator2())); // 2
        System.out.println(Collections.binarySearch(l,13,new MyComparator2())); //-3
        System.out.println(Collections.binarySearch(l,17)); // -6 ==> unpredictable result


    }
}
