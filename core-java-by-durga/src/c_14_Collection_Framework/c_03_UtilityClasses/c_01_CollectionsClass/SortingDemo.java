package c_14_Collection_Framework.c_03_UtilityClasses.c_01_CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        return s2.compareTo(s1);
    }
}

public class SortingDemo {
    public static void main(String[] args) {
        // Default natural sorting order
        ArrayList l=new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");
     //   l.add(new Integer(10));
     //   l.add(null);
        System.out.println(l); // [Z, A, K, N]
        Collections.sort(l);
        System.out.println(l); // [A, K, N, Z]

        System.out.println("------------------------------------");
        ArrayList al=new ArrayList();
        al.add("Z");
        al.add("A");
        al.add("K");
        al.add("L");
        System.out.println(al); // [Z, A, K, L]
        Collections.sort(al,new MyComparator());
        System.out.println(al); // [Z, L, K, A]

    }
}
