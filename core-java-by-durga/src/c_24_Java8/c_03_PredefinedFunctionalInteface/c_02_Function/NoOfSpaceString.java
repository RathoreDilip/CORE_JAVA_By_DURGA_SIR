package c_24_Java8.c_03_PredefinedFunctionalInteface.c_02_Function;

import java.util.function.Function;

public class NoOfSpaceString {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        // change string without space
        Function<String,String> f=s->s.replaceAll(" ","");
        System.out.println(f.apply("Durga Software Solution Hydrabad"));

        // no of space present in the string
        Function<String,Integer> f2=s->s.length()-s.replaceAll(" ","").length();
        System.out.println(f2.apply("Durga Software Solution Hydrabad"));
    }
}
