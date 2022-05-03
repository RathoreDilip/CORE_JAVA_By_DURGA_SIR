package c_24_Java8.c_03_PredefinedFunctionalInteface.c_02_Function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        // eg.1
        Function<String,String> f1=s->s.toUpperCase();
        Function<String,String> f2=s->s.substring(0,9);
        System.out.println(f1.andThen(f2).apply("Aishwaryaabhi"));  // AISHWARYA
        System.out.println(f2.compose(f1).apply("Aishwaryaabhi"));  // AISHWARYA

        // eg.2
        Function<Integer,Integer> f3=i->i+i;
        Function<Integer,Integer> f4=i->i*i*i;
        System.out.println(f3.andThen(f4).apply(2)); // 4 * 4 * 4 = 64
        System.out.println(f3.compose(f4).apply(2)); // 8 + 8 = 16

    }
}
