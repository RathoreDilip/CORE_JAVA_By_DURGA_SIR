package c_24_Java8.c_03_PredefinedFunctionalInteface.c_01_Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // check no is greater than 10
        Predicate<Integer> p1=i->i>10;
        System.out.println(p1.test(20)); // true
        System.out.println(p1.test(5));  // false

        // check string length is greater than 5 or not
        Predicate<String> p2=s->s.length()>5;
        System.out.println(p2.test("abcdef")); // true
        System.out.println(p2.test("abc"));    // false

        // check list is empty or not
        Predicate<Collection> p3= al->al.isEmpty();
        ArrayList l1=new ArrayList();
        l1.add("abc");
        ArrayList l2=new ArrayList();
        System.out.println(p3.test(l1)); // false
        System.out.println(p3.test(l2)); // true
    }
}
