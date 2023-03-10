package c24_Java8_New_Features.c_05_Streams.c_02_Processing;

import java.util.ArrayList;

public class CollectMethodDemoWithoutStream {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        // print even numbers
        ArrayList<Integer> list2=new ArrayList<>();
        for (Integer i:list) {
            if(i%2==0)
                list2.add(i);
        }
        System.out.println(list2);
    }
}
