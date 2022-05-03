package c_16_Generics.c_03_boundedTypes;

class Test<T extends Number>{

}
public class BoundedTypeDemo {
    public static void main(String[] args) {
        Test<Integer> t1=new Test<Integer>();
       // Test<String> t2=new Test<String>();
    }
}
