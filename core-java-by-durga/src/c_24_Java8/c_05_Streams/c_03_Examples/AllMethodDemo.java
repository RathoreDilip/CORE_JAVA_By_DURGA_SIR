package c24_Java8_New_Features.c_05_Streams.c_03_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllMethodDemo {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("David");
        names.add("Johnson");names.add("Samontika");names.add("Brijesh");
        names.add("John");names.add("David");
        names.add("Brijesh");names.add("Samosakin");

        System.out.println(names);

        // Selecting only unique name
        System.out.println("Selecting only unique name...");
        names.stream()
                .distinct()
                .forEach(System.out::println);

        // limit - Selecting first n elements
        System.out.println("Selecting first n elements..");
        names.stream()
                .limit(3)
                .forEach(System.out::println);

        // skip - skip first n elements
        System.out.println("Skip first n elements...");
        names.stream()
                .skip(2)
                .forEach(System.out::println);

        // Sorting
        System.out.println("Sorting according to supplied order...");
        names.stream()
                .sorted((s1,s2)->(s1.length()>s2.length())?1:(s1.length()<s2.length())?-1:s1.compareTo(s2))
                .forEach(System.out::println);

        // reduce - produce a single value
        System.out.println("Reduce value..");
        int sum = Arrays.stream(new int[]{7, 5, 9, 2, 8, 1}).reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        // second largest elements in an array
        System.out.println("second largest.. sorted ");
        int arr[]={7, 5, 9, 2, 8, 1};
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);
        System.out.println("second largest..");
        int secLargest = Arrays.stream(arr)
                .sorted()
                .skip(arr.length-2)
                .findFirst()
                .getAsInt();

        System.out.println(secLargest);

        // find the minimum
        System.out.println("minimum elements..");
        int min = Arrays.stream(new int[]{7, 5, 9, 2, 8, 1})
                .min().getAsInt();
        System.out.println(min);

        // find the maximum
        System.out.println("maximum elements...");
        int max = Arrays.stream(new int[]{7, 5, 9, 2, 8, 1})
                .max().getAsInt();
        System.out.println(max);

        // count the elements
        System.out.println("count string length greater than 5..");
        long count = names.stream()
                .filter(s -> s.length() > 5).count();
        System.out.println(count);

        // collect methods..
        System.out.println("Collect 3 elements...");
        List<String> collect3ele = names.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(collect3ele);

        // Finding and matching operation
        System.out.println("=====================");

        // anyMatch - anyone elements match
        System.out.println("anyMatch - which length 5");
        boolean b = names.stream()
                .anyMatch(s -> s.length() == 5);
        if(names.stream()
                .anyMatch(s -> s.length() > 5)){
            System.out.println("Yes... there is a name exist with 5 latter ...");
        }

        // allMatch
        System.out.println("allMatch - which length 5");
        boolean allMatch = names.stream()
                .allMatch(s -> s.length() > 5);
        System.out.println(allMatch);

        // nonMatch
        System.out.println("no elements match");
        boolean nonMatch = names.stream()
                .noneMatch(s -> s.length() == 2);
        System.out.println(nonMatch);

        // findFirst
        System.out.println("finding first element");
        String first = names.stream()
                .sorted()
                .findFirst().get();
        System.out.println(first);

        first = Stream.of("first", "second", "Third", "Fourth")
                .findFirst().get();
        System.out.println(first);

        // findAny
        System.out.println("Finding any elements..");
        String findAny = Stream.of("First", "Second", "Third", "Fourth")
                .findAny().get();
        System.out.println(findAny);

        // forEach
        System.out.println("For each..");
        Stream.of("First","Second","Third","Fourth")
                .limit(3)
                .forEach(System.out::println);

        // toArray()
        System.out.println("toArray()...");
        Object[] streamArray = names.stream()
                .limit(3)
                .toArray();
        System.out.println(Arrays.toString(streamArray));

        // peek() - this support debugging
        System.out.println("peek...");
        Object[] peekArray = names.stream()
                .filter(s -> s.length() > 5)
                .peek(e -> System.out.println("filter name:" + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("mapped value:" + e))
                .toArray();
        System.out.println(Arrays.toString(peekArray));

        Arrays.stream(new int[]{7, 5, 9, 2, 8, 1})
                .peek(value -> System.out.println("arr :: "+value))
                .sorted()
                .peek(value -> System.out.println("arr2 :: "+value))
                .toArray();




    }
}
