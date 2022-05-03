package c_14_Collection_Framework.c_02_Map;

// underlying data structure is red black tree
// insertion order is not preserved
// if we are depending on default natural sorting order then the keys should be homogenous & comparable
// if we are defining our own sorting order by comparator then the keys not be homogenous & comparable
// no restriction on values (it can be heterogeneous)
// duplicates keys are not allowed but dupicate values are allowed

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap m=new TreeMap();
        m.put(100,"ZZZ");
        m.put(103,"YYY");
        m.put(101,"XXX");
        m.put(104,106);
        m.put(107,null);
     //   m.put("fff","xxx"); // cce
     //   m.put(null,"xxx");  // npe
        System.out.println(m); // {100=ZZZ, 101=XXX, 103=YYY, 104=106, 107=null}
    }
}
