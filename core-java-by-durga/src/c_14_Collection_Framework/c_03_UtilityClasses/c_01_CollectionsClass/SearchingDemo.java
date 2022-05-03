package c_14_Collection_Framework.c_03_UtilityClasses.c_01_CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class SearchingDemo {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("M");
        l.add("K");
        l.add("a");
        System.out.println(l); // [Z, A, M, K, a]
        Collections.sort(l);
        System.out.println(l); // [A, K, M, Z, a]

        System.out.println(Collections.binarySearch(l,"Z")); // 3
        System.out.println(Collections.binarySearch(l,"j")); //-6

    }
}
