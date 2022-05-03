package c_14_Collection_Framework.c_01_Collection.c_01_ListInterface;

// Resizeable and growable array
// Heterogeneous objects are allowed
// duplicates are allowed
// insertion order preserved
// null insertion is possible
// default max capacity is 10 and after maxCapacity=currentCapacity*3/2+1 = 10 * 3/2 + 1 = 16

import java.util.ArrayList;
import java.util.RandomAccess;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("A");
        al.add(10);
        al.add('A');
        al.add(null);
        System.out.println(al); // [A, 10, A, null]
        al.remove(2);
        System.out.println(al); // [A, 10, null]
        al.add(2,"M");
        al.add("N");
        System.out.println(al); // [A, 10, M, null, N]

    }
}
