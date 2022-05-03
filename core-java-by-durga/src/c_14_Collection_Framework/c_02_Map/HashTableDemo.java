package c_14_Collection_Framework.c_02_Map;

// underlying data structure is hashTable
// heterogeneous objects are allowed
// insertion order is not preserved
// null is not allowed for both keys and values
// duplicates keys are not allowed but dupicate values are allowed
// all method is synchronized
// hashTable is the best choice if our frequent operation is search operation

import java.util.Hashtable;

class TempDemo{
    int i;
    TempDemo(int i){
        this.i=i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return i+"";
    }
}

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable h=new Hashtable();
        h.put(new TempDemo(5),"A");
        h.put(new TempDemo(2),"B");
        h.put(new TempDemo(6),"C");
        h.put(new TempDemo(15),"D");
        h.put(new TempDemo(23),"E");
        h.put(new TempDemo(16),"F");
       // h.put("durga",null);  // NullPointerException
        System.out.println(h); // {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
    }
}
