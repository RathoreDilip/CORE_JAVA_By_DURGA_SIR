package c_24_Java8.c_05_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapFilterDemo {
    public static void main(String[] args) {
        // eg.1 : print even numbers
        ArrayList<Integer> l=new ArrayList<>();
        populate(l);

        // without streams (until 1.7v)
        List<Integer> l1=new ArrayList<>();
        for (Integer i:l) {
            if(i%2==0)
                l1.add(i);
        }
        System.out.println(l1); // [0, 10, 20]

        // with Streams (From 1.8v)
        List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2); // [0, 10, 20]

        // eg.2 : find square root

        // without streams (until 1.7v)
        l1=new ArrayList<>();
        for (Integer i:l)
              l1.add(i*2);

        System.out.println(l1); // [0, 20, 40, 10, 30, 50]

        // with Streams (From 1.8v)
        List<Integer> l3=l.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l3); // [0, 20, 40, 10, 30, 50]

    }
    public static void populate(ArrayList<Integer> l){
        l.add(0);l.add(10);l.add(20);l.add(5);l.add(15);l.add(25);
        System.out.println(l); // [0, 10, 20, 5, 15, 25]
    }
}
