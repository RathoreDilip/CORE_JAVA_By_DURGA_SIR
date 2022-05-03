package c_10_Java_Lang_Package.c_02_StringClass;

public class StringClassDemo {
    public static void main(String[] args) {
        // case 1 - string class is immutable we can't perform any changes in the existing objects
        String s=new String("durga");
        s.concat("software");
        System.out.println(s); // durga

        // StringBuilder class is mutable
        StringBuffer sb=new StringBuffer("durga");
        sb.append("software");
        System.out.println(sb); // durgasoftware

        // case 2 - String class equals method ment for content comparisons
        String s1=new String("durga");
        String s2=new String("durga");
        System.out.println(s1==s2); // false
        System.out.println(s1.equals(s2)); // true

        // StringBuilder class equals method ment for reference comparisons
        StringBuffer sb1=new StringBuffer("durga");
        StringBuffer sb2=new StringBuffer("durga");
        System.out.println(sb1==sb2); // false
        System.out.println(sb1.equals(sb2)); // false

        // intern() method
        // By using heap objects reference if you want to get corresponding scp object reference then we should
        // go for intern()
        String ss1=new String("durga");
        String ss2=ss1.intern();
        System.out.println(ss1==ss2); // false
        String ss3="durga";
        System.out.println(ss2==ss3); // true

    }
}
