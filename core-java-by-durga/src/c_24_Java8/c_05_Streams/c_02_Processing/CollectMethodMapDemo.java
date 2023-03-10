package c24_Java8_New_Features.c_05_Streams.c_02_Processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethodMapDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Deep");list.add("Dilip");list.add("Dipak");list.add("Raj");list.add("Rahul");

        List<String> collect = list.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
