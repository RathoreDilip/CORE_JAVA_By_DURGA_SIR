package c_14_Collection_Framework.c_01_Collection.c_01_ListInterface;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v=new Vector();
        System.out.println(v.capacity());
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("A");
        System.out.println(v.capacity());
        System.out.println(v);
    }
}
