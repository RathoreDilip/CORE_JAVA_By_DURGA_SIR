package c_24_Java8.c_05_Streams;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        StreamsMapFilterDemo.populate(l);

        // eg.1
        l.stream().forEach(s-> System.out.print(s+" "));

        // eg.2
        l.stream().forEach(System.out::println);


    }
}
