package c_24_Java8.c_01_LambdaExpression.c_02_Collections;

// store data in key-value pair

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("A","Apple");
        map.put("Z","Zebra");
        map.put("durga","Java");
        map.put("B","Boy");
        map.put("T","Tiger");
        map.put("C","Cat");
        System.out.println(map);
    }
}
