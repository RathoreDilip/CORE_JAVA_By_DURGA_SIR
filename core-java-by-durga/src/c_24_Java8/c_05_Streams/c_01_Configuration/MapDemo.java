package c24_Java8_New_Features.c_05_Streams.c_01_Configuration;

import java.util.ArrayList;

public class MapDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);list.add(5);list.add(10);list.add(15);list.add(20);list.add(25);
        System.out.println(list);

        // add 1 in all elements
        list.stream()
                .map(i->i+1).forEach(System.out::println);

    }
}
