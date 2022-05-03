package c_14_Collection_Framework.c_01_Collection.c_02_SetInterface;

// comparable ment for default natural sorting

import java.util.TreeSet;

public class ComparableDemo1 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add("Z");
        t.add("K");
        t.add("D");
        t.add("M");
        t.add("D");
        System.out.println(t);
    }
}
