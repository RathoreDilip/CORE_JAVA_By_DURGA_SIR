package c_14_Collection_Framework.c_02_Map;

import java.util.*;

// underlying data structure is hashtable + LinkedList
// insertion order is preserved

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap m=new LinkedHashMap();
        m.put("chiranjeevi",700);
        m.put("balaih",800);
        m.put("venketesh",1000);
        m.put("nagarjuna",500);
        System.out.println(m); // {chiranjeevi=700, balaih=800, venketesh=1000, nagarjuna=500}


        System.out.println(m.put("chiranjeevi",1000)); // 700
        Set s = m.keySet();
        System.out.println(s); // [chiranjeevi, balaih, venketesh, nagarjuna]
        Collection values = m.values();
        System.out.println(values); // [1000, 800, 1000, 500]

        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry m1= (Map.Entry) iterator.next();
            System.out.println(m1.getKey()+"----"+m1.getValue());
            if(m1.getKey().equals("nagarjuna"))
                m1.setValue(14000);
        }
        System.out.println(m); // {chiranjeevi=1000, balaih=800, venketesh=1000, nagarjuna=14000}


    }
}
