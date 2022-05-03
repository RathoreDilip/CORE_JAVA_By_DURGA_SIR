package c_14_Collection_Framework.c_03_UtilityClasses.c_02_ArraysClasses;

import java.util.Arrays;
import java.util.Comparator;

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        return s2.compareTo(s1);
    }
}

public class ArraysSortingDemo {
    public static void main(String[] args) {
        int[] a={10,5,20,11,6};
        System.out.println("Primitive array before sorting..");
        System.out.println(Arrays.toString(a)); // [10, 5, 20, 11, 6]
        Arrays.sort(a);
        System.out.println("Primitive array after soring..");
        System.out.println(Arrays.toString(a)); // [5, 6, 10, 11, 20]

        System.out.println("-----------------------------------");

        String[] s={"A","Z","B"};
        System.out.println("Object array before sorting..");
        System.out.println(Arrays.toString(s)); // [A, Z, B]
        Arrays.sort(s);
        System.out.println("Object array after soring..");
        System.out.println(Arrays.toString(s)); // [A, B, Z]

        System.out.println("-----------------------------------");

        Arrays.sort(s,new MyComparator());
        System.out.println("Object array after sorting by comparator..");
        System.out.println(Arrays.toString(s)); // [Z, B, A]

    }
}
