package c_24_Java8.c_01_LambdaExpression.c_02_Collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Integer> {

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

public class TreeSetCompareDemo {
    public static void main(String[] args) {
        // TreeSet<Integer> t=new TreeSet<>();  // Default Data
        TreeSet<Integer> t=new TreeSet<>(new MyComparator());  // Custom Sorting
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(25);
        t.add(5);
        t.add(20);
        System.out.println(t); // [25, 20, 15, 10, 5, 0]
    }
}
