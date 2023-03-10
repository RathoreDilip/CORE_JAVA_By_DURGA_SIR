package c24_Java8_New_Features.c_05_Streams.c_02_Processing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingMethodsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);list.add(15);list.add(10);list.add(5);list.add(30);list.add(25);list.add(20);
        System.out.println(list);

        // map demo - add 1 to every element
        System.out.println("map demo - add 1 to every element");
        List<Integer> add1MapList = list.stream()
                .map(i -> (i + 1))
                .collect(Collectors.toList());
        System.out.println(add1MapList);

        // count even numbers
        System.out.println("Count even numbers");
        long count = list.stream()
                .filter(i -> i % 2 == 0)
                .count();
        System.out.println(count);

        // default natural sorting
        System.out.println("Default natural sort..");
        List<Integer> defaultSort = list.stream()
                .sorted().collect(Collectors.toList());
        System.out.println(defaultSort);

        // custom sorting
        System.out.println("Custom sort...");
        Comparator<Integer> comparator=(I1,I2)->I2.compareTo(I1);
        List<Integer> customSort = list.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
        System.out.println(customSort);

        // min
        System.out.println("Minimum number");
        Integer min = list.stream()
                .sorted().min((I1,I2)->I1.compareTo(I2)).get();
        System.out.println(min);

        // max
        System.out.println("Maximum number");
        Integer max = list.stream()
                .sorted().max((I1, I2) -> I1.compareTo(I2)).get();
        System.out.println(max);

        // foreach demo
        System.out.println("foreach demo");
        list.stream()
                .forEach(System.out::println);

        System.out.println("foreach lambda expression demo");
        list.stream()
                .forEach(s-> System.out.println(s));


    }
}
