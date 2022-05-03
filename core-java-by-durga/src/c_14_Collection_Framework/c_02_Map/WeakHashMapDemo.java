package c_14_Collection_Framework.c_02_Map;

// in case of hashmap object is not eligible for garbage collection
// but in weakHashMap it is eligible for garbage collection

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method call..");
    }

    @Override
    public String toString() {
        return "temp";
    }
}

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        HashMap m=new HashMap();
        Temp t=new Temp();
        m.put(t,"durga");
        System.out.println(m); // {temp=durga}
        t=null;

        System.gc();
        Thread.sleep(500);
        System.out.println(m); // {temp=durga}

        System.out.println("--------------------------------------");

        WeakHashMap wm=new WeakHashMap();
        Temp t1=new Temp();
        wm.put(t1,"durga");
        System.out.println(wm); // {temp=durga}
        t1=null;

        System.gc(); // Finalize method call..
        Thread.sleep(500);
        System.out.println(wm); // {}

    }
}
