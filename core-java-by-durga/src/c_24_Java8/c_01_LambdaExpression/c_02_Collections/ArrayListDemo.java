package c_24_Java8.c_01_LambdaExpression.c_02_Collections;

import java.util.ArrayList;

// Insertion order preserved
// Duplicates objects allowed

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<String>();
        l.add("Sunny");
        l.add("Bunny");
        l.add("Chinny");
        l.add("Sunny");
        System.out.println(l); // [Sunny, Bunny, Chinny, Sunny]

    }
}
