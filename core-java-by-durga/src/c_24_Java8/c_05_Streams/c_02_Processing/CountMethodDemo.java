package c24_Java8_New_Features.c_05_Streams.c_02_Processing;

import java.util.ArrayList;

public class CountMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Deep");list.add("Dilip");list.add("Dipak");list.add("Raj");list.add("Rahul");

        long count = list.stream()
                .filter(s -> s.length() == 5)
                .count();

        System.out.println("Length equal to 5 : "+count);
    }
}
