package c_10_Java_Lang_Package.c_05_WrapperClass;

public class WrapperClassDemo {
    public static void main(String[] args) {
        Integer i1=new Integer(10);
        Integer i2=new Integer("20");
        System.out.println(i1); // 10
        System.out.println(i2); // 20

        // valueOf()
        // primitive or String to wrapper object
        Integer I1=Integer.valueOf("1010",2);
        System.out.println(I1);  // 10
        System.out.println(Integer.toBinaryString(11)); // 1011

        Character ch=Character.valueOf('a');
        System.out.println(ch); // a

        // xxxValue()
        // wrapper object to primitive
        Double d=new Double(130.46);
        System.out.println(d.byteValue()); // -126
        System.out.println(d.intValue());  //  130

        // parseXXX()
        // String to primitive
        int val=Integer.parseInt("10");
        System.out.println(val); // 10

    }
}
