package c_24_Java8.c_01_LambdaExpression.c_02_Collections;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparatorDemo1 implements Comparator<Integer> {

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
public class TreeMapComparatorDemo {
    public static void main(String[] args) {
       // TreeMap<Integer,String> tm=new TreeMap<>();   // Default data
        TreeMap<Integer,String> tm=new TreeMap<>(new MyComparatorDemo1()); // Custom sorting
        tm.put(100,"Durga");
        tm.put(600,"Sunny");
        tm.put(300,"Bunny");
        tm.put(200,"Chinny");
        tm.put(700,"Vinny");
        tm.put(400,"Pinny");
        System.out.println(tm); //  {700=Vinny, 600=Sunny, 400=Pinny, 300=Bunny, 200=Chinny, 100=Durga}

    }
}
