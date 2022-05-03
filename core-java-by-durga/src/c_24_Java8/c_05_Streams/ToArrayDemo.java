package c_24_Java8.c_05_Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        StreamsMapFilterDemo.populate(l);

        Integer[] array = l.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
    }
}
