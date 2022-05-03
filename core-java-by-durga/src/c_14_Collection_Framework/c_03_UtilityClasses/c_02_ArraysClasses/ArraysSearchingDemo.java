package c_14_Collection_Framework.c_03_UtilityClasses.c_02_ArraysClasses;

import java.util.Arrays;
import java.util.Comparator;

class MyComparator2 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        return s2.compareTo(s1);
    }
}

public class ArraysSearchingDemo {
    public static void main(String[] args) {
        int[] a={10,5,20,11,6};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a)); // [5, 6, 10, 11, 20]

        System.out.println(Arrays.binarySearch(a,6)); // 1
        System.out.println(Arrays.binarySearch(a,14));//-5

        System.out.println("------------------------------");

        String[] s={"A","Z","B"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s)); // [A, B, Z]
        System.out.println(Arrays.binarySearch(s,"Z")); // 2
        System.out.println(Arrays.binarySearch(s,"S")); //-3

        Arrays.sort(s,new MyComparator2());
        System.out.println(Arrays.toString(s)); // [Z, B, A]

        System.out.println(Arrays.binarySearch(s,"Z",new MyComparator2())); // 0
        System.out.println(Arrays.binarySearch(s,"S",new MyComparator2())); // -2
        System.out.println(Arrays.binarySearch(s,"N")); // -4 ==> unpredictable result

    }
}
