package c_14_Collection_Framework.c_02_Map;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1= (String) o1;
        String s2= (String) o2;
        return s2.compareTo(s1);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeMap m=new TreeMap(new MyComparator());
        m.put("XXX",10);
        m.put("AAA",20);
        m.put("ZZZ",30);
        m.put("LLL",40);
        System.out.println(m); // {ZZZ=30, XXX=10, LLL=40, AAA=20}
    }
}
