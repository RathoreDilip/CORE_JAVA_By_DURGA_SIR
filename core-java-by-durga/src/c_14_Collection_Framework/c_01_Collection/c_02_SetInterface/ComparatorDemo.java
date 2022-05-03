package c_14_Collection_Framework.c_01_Collection.c_02_SetInterface;

import java.util.Comparator;
import java.util.TreeSet;

// comparator ment for customized sorting

class MyComaprator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;

        if(I1>I2)
            return -1;
        else if(I1<I2)
            return 1;
        else
            return 0;

//              return I1.compareTo(I2); // [0, 5, 10, 15, 20]
//              return -I1.compareTo(I2); // [20, 15, 10, 5, 0]
//              return I2.compareTo(I1); //  [20, 15, 10, 5, 0]
//              return -I2.compareTo(I1); // [0, 5, 10, 15, 20]
//              return -1; // [10, 5, 15, 0, 20]
//              return 1;  // [20, 0, 15, 5, 10]
//              return 0; // [20]
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComaprator());
        t.add(20);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(10);
        System.out.println(t); // [20, 15, 10, 5, 0]
    }
}
