package c24_Java8_New_Features.c_05_Streams.c_02_Processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinAndMaxMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Deep");list.add("Ajay");list.add("Ziv");list.add("Raj");list.add("Rahul");
        System.out.println(list);

        List<String> sorted=list.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        String max = list.stream()
                  .max((s1, s2) -> s1.compareTo(s2)).get();

        String min=list.stream()
                        .min((s1, s2) -> s1.compareTo(s2)).get();

        System.out.println(max);
        System.out.println(min);

        ArrayList<Integer> l=new ArrayList<>();
        l.add(0);l.add(5);l.add(10);l.add(8);l.add(7);l.add(12);l.add(9);l.add(4);l.add(3);
        System.out.println(l);

        int largest=l.stream()
                .max((I1,I2)->I1.compareTo(I2)).get();
        System.out.println(largest);

        int minimum=l.stream()
                .min((I1,I2)->I1.compareTo(I2)).get();
        System.out.println(minimum);

    }
}
