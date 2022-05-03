package c_24_Java8.c_01_LambdaExpression.c_02_Collections;

import java.util.HashSet;

// Insertion Order not preserved
// Duplicates objects not allowed

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        h.add("Sunny");
        h.add("Bunny");
        h.add("Chinny");
        h.add("Sunny");
        System.out.println(h);  // [Chinny, Bunny, Sunny]
    }
}
