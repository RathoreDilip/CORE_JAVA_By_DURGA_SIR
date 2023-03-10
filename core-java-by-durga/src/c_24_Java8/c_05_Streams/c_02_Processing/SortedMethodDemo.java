package c24_Java8_New_Features.c_05_Streams.c_02_Processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Deep");list.add("Ajay");list.add("Ziv");list.add("Raj");list.add("Rahul");
        System.out.println(list);

        // Default natural sorting order...
        List<String> sortList = list.stream()
                .sorted().collect(Collectors.toList());

        System.out.println(sortList);

        // Custom sorting order
        List<String> desSortList = list.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());

        System.out.println(desSortList);
    }
}
