package c_14_Collection_Framework.c_01_Collection.c_04_TypesOfCursor;

import java.util.Enumeration;
import java.util.Vector;

// it is applicable for legacy classes (Vector,Stack)
// we can't remove object

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector v=new Vector();
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }
        System.out.println(v);

        Enumeration elements = v.elements();
        while (elements.hasMoreElements())
        {
            Integer I= (Integer) elements.nextElement();
            if(I%2==0)
                System.out.print(I+" ");
        }
        System.out.println(v);
    }
}
