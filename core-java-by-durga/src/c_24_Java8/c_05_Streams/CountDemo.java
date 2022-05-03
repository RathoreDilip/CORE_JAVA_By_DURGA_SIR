package c_24_Java8.c_05_Streams;

import java.util.ArrayList;

public class CountDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(0);l.add(10);l.add(20);l.add(5);l.add(15);l.add(25);
        System.out.println(l); // [0, 10, 20, 5, 15, 25]

        long count=l.stream().filter(i->i>10).count();
        System.out.println(count);

    }
}
