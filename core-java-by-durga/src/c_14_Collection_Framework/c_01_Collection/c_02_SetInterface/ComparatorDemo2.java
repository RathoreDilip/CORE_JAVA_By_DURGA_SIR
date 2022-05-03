package c_14_Collection_Framework.c_01_Collection.c_02_SetInterface;

// write a program to insert String & StringBuffer objects into the treeSet where the soring order
// increasing length orders. If two objects having same length then consider alphabetic order.

import java.util.Comparator;
import java.util.TreeSet;

class MyComparatorDemo2 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        if(s1.length() < s2.length())
            return -1;
        else if(s1.length() > s2.length())
            return 1;
        else
            return s1.compareTo(s2);
    }
}

public class ComparatorDemo2 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparatorDemo2());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");
        System.out.println(t); //[A, AA, XX, ABC, ABCD]
    }
}
