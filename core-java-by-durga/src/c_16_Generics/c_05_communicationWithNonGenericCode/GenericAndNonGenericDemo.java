package c_16_Generics.c_05_communicationWithNonGenericCode;

import java.util.ArrayList;

public class GenericAndNonGenericDemo {
    public static void main(String[] args) {
        // generic area
        ArrayList<String> l=new ArrayList<>();
        l.add("ABC");
        l.add("XYZ");
       // l.add(10.4);
        m1(l);
        System.out.println(l);
    }
    public static void m1(ArrayList l){
        // non generic area
        l.add(10);
        l.add(true);
        l.add('c');
        l.add(10.4);
    }
}
