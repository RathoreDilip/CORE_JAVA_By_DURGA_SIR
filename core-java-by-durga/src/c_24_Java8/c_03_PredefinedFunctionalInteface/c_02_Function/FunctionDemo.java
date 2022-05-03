package c_24_Java8.c_03_PredefinedFunctionalInteface.c_02_Function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        // Find length of the string
        Function<String,Integer> f1=s->s.length();
        System.out.println(f1.apply("durga"));
        System.out.println(f1.apply("durgasoft"));

        // Find square root of the number
        Function<Integer,Integer> f2=i->i*i;
        System.out.println(f2.apply(5));
        System.out.println(f2.apply(25));
    }
}
