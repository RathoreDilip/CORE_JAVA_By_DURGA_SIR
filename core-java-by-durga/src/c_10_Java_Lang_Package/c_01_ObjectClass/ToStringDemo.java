package c_10_Java_Lang_Package.c_01_ObjectClass;

import java.util.ArrayList;

class Test{
    @Override
    public String toString() {
        return "Test";
    }
}
public class ToStringDemo {
    public static void main(String[] args) {
        // object class
        Test t=new Test();
        // wrapper class
        String s=new String("durga");
        Integer i=new Integer(10);

        ArrayList list=new ArrayList();
        list.add("A");
        list.add("B");

        System.out.println(t);
        System.out.println(s);
        System.out.println(i);
        System.out.println(list);
    }
}
