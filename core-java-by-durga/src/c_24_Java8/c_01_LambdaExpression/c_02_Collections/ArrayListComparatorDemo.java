package c_24_Java8.c_01_LambdaExpression.c_02_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparatorDemo implements Comparator<Integer>{

    @Override
    public int compare(Integer I1, Integer I2) {
        if(I1>I2)
            return -1;
        else if(I1<I2)
            return 1;
        else
            return 0;
    }
}
public class ArrayListComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);
        System.out.println("Before sorting :: "+l); // [10, 0, 15, 5, 20]
        Collections.sort(l);
        System.out.println("After Default Natural Sorting :: "+l); // [0, 5, 10, 15, 20]
        Collections.sort(l,new MyComparatorDemo());
        System.out.println("After Custome Sorting :: "+l); // [20, 15, 10, 5, 0]
    }
}
