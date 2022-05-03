package c_14_Collection_Framework.c_03_UtilityClasses.c_02_ArraysClasses;

import java.util.Arrays;
import java.util.List;

public class ConvertingArrayToList {
    public static void main(String[] args) {
        String[] s={"A","Z","B"};
        List l= Arrays.asList(s);
        System.out.println(l); // [A, Z, B]

        s[0]="K";
        System.out.println(l); // [K, Z, B]

        l.set(1,"L"); //
        System.out.println(l); // [K, L, B]
        System.out.println(Arrays.toString(s)); // [K, L, B]

       // l.add("durga"); // UnsupportedOperationException
       // l.remove(2); // UnsupportedOperationException
       // l.set(1,10); // ArrayStoreException
    }
}
