package c_24_Java8.c_03_PredefinedFunctionalInteface.c_01_Predicate;

import java.util.function.Predicate;

public class NamesStartWithK {
    public static void main(String[] args) {
        String names[]={"Sunny","Kajal","Mallika","Katrina","Karina"};
        Predicate<String> p=name->name.charAt(0)=='K';

        for (String name:names) {
            if(p.test(name))
                System.out.println(name);
        }
    }
}
