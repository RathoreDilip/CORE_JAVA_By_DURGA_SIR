package c_14_Collection_Framework.c_01_Collection.c_02_SetInterface;

// insertion order is not preserved
// duplicates are not allowed

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));
        System.out.println(h); // [null, B, C, D, Z, 10]
    }
}
