package c_24_Java8.c_05_Streams;

import java.util.ArrayList;

public class MinMaxDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        StreamsMapFilterDemo.populate(l);

        // min
        Integer min=l.stream().min((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println(min);

        // max
        Integer max=l.stream().max((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println(max);

    }
}
