package c24_Java8_New_Features.c_05_Streams.c_02_Processing;

import java.util.ArrayList;

public class ForEachMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Deep");list.add("Ajay");list.add("Ziv");list.add("Raj");list.add("Rahul");

        list.stream().sorted()
                .forEach(System.out::println);
        System.out.println("----------------------------");
        list.stream()
                .forEach(s -> System.out.println(s));
    }
}
