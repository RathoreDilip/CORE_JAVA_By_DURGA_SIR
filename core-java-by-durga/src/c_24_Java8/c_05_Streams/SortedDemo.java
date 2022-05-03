package c_24_Java8.c_05_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        StreamsMapFilterDemo.populate(l);

        // List According to default natural sorting order
        List<Integer> l1=l.stream().sorted().collect(Collectors.toList());
        System.out.println(l1);

        // List According to customize sorting order
        List<Integer> l2=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(l2);

    }
}
