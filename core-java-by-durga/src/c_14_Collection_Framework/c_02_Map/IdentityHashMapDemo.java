package c_14_Collection_Framework.c_02_Map;

// In Hashmap key values check by equals() method
// In IdentityHashMap key values check by (== operator) reference

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        HashMap m=new HashMap();
        Integer I1=new Integer(10);
        Integer I2=new Integer(10);
        m.put(I1,"pavan");
        m.put(I2,"kalyan");
        System.out.println(m); // {10=kalyan}

        IdentityHashMap ihm=new IdentityHashMap();
        Integer I3=new Integer(10);
        Integer I4=new Integer(10);
        ihm.put(I3,"pavan");
        ihm.put(I4,"kalyan");
        System.out.println(ihm); // {10=pavan, 10=kalyan}

    }
}
