package c_05_OOPs_Object_Oriented_Programming;

public class Overloading {
    public void m1(StringBuffer sb){
        System.out.println("StringBuffer sb called..");
    }
    public void m1(String s){
        System.out.println("String version..");
    }

    public static void main(String[] args) {
        Overloading o=new Overloading();
        o.m1(new StringBuffer("Hello"));
        o.m1("Hi");
        // o.m1(null);
    }
}
