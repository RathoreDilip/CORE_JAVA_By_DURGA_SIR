package c_24_Java8.c_01_LambdaExpression.c_02_Collections;

import java.util.TreeSet;

public class TreeSetSortLambdaExpression {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);  // Lambda Expression
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(25);
        t.add(5);
        t.add(20);
        System.out.println(t); // [25, 20, 15, 10, 5, 0]

    }
}
