package c24_Java8_New_Features.c_05_Streams.c_01_Configuration;

import java.util.ArrayList;

public class FilterDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);list.add(5);list.add(10);list.add(15);list.add(20);list.add(25);
        System.out.println(list);

        // filter even numbers are..
        list.stream()
                .filter(i -> i%2==0).forEach(System.out::println);

    }
}
