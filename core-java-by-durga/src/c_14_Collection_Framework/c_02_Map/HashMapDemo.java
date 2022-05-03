package c_14_Collection_Framework.c_02_Map;

// underlying data structure is hashtable
// insertion order is not preserved

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m=new HashMap();
        m.put("chiranjeevi",700);
        m.put("balaih",800);
        m.put("venketesh",1000);
        m.put("nagarjuna",500);
        System.out.println(m); // {venketesh=1000, chiranjeevi=700, balaih=800, nagarjuna=500}

        System.out.println(m.put("chiranjeevi",1000)); // 700
        Set s = m.keySet();
        System.out.println(s); // [venketesh, chiranjeevi, balaih, nagarjuna]
        Collection values = m.values();
        System.out.println(values); // [1000, 1000, 800, 500]

        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry m1= (Map.Entry) iterator.next();
            System.out.println(m1.getKey()+"----"+m1.getValue());
            if(m1.getKey().equals("nagarjuna"))
                m1.setValue(14000);
        }
        System.out.println(m); // {venketesh=1000, chiranjeevi=1000, balaih=800, nagarjuna=14000}

    }
}
