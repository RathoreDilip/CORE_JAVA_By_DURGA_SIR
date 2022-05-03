package c_14_Collection_Framework.c_01_Collection.c_02_SetInterface;

// combination of hashtable and LinkedList
// insertion order is preserved
// duplicates are not allowed

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet h=new LinkedHashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));
        System.out.println(h); // [B, C, D, Z, null, 10]
    }
}
