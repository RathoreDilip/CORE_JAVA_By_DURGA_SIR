package c_14_Collection_Framework.c_01_Collection.c_02_SetInterface;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("z");
        t.add("L");
        // t.add(null);  // null pointer exception
        System.out.println(t); // [A, B, L, a, z]
    }
}
