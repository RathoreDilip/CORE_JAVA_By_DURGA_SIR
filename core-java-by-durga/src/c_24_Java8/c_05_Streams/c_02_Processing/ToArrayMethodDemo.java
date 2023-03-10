package c24_Java8_New_Features.c_05_Streams.c_02_Processing;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayMethodDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);list.add(15);list.add(10);list.add(5);list.add(30);list.add(25);list.add(20);
        System.out.println(list);

        // list to array
        Integer[] listArr = list.stream()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(listArr));

        Integer[] listArr2 = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(listArr2));


    }
}
