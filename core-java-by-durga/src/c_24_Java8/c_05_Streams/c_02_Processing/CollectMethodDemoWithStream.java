package c24_Java8_New_Features.c_05_Streams.c_02_Processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethodDemoWithStream {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        List<Integer> list2=list.stream()
                .filter(i->i%2==0)
                .collect(Collectors.toList());

        System.out.println("using stream collectors.."+list2);
    }
}
