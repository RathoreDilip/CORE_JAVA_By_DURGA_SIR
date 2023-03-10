package c24_Java8_New_Features.c_05_Streams.c_02_Processing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfMethodDemo {
    public static void main(String[] args) {
        Stream stream=Stream.of(9,99,999,9999,99999);
        stream.forEach(System.out::println);

        System.out.println("-----------------------");
        Double d[]={10.0,0.0,10.1,10.2,10.3,10.4};
        System.out.println(Arrays.toString(d));

        Stream stream1=Stream.of(d);
        stream1.sorted()
                .forEach(System.out::println);

        System.out.println("=======================");
        Integer arr[]={10,20,5,11,23,12,16,18,19};
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------");
        Stream.of(arr)
                .sorted()
                .forEach(System.out::println);
        System.out.println("----------------------");
        Integer secondLargest = Stream.of(arr)
                .sorted()
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondLargest);
        System.out.println("----------------------");


    }
}
