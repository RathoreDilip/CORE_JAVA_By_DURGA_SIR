package c_24_Java8.c_03_PredefinedFunctionalInteface.c_01_Predicate;

import java.util.function.Predicate;

public class RemoveNullAndEmptyValues {
    public static void main(String[] args) {
        String names[]={"Durga","",null,"Ravi","","Shiva",null};
        Predicate<String> p=name->name!=null && name.length()>0;
        for (String name: names)
            if(p.test(name))
                System.out.println(name);


    }
}
