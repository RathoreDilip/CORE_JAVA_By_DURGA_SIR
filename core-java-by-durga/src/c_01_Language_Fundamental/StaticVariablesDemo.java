package c_01_Language_Fundamental;

public class StaticVariablesDemo {
    int x=10;
    static int y=20;

    public static void main(String[] args) {
        StaticVariablesDemo s1=new StaticVariablesDemo();
        s1.x=888;
        s1.y=999;

        StaticVariablesDemo s2=new StaticVariablesDemo();
        System.out.println(s2.x+"--------"+s2.y); // 10--------999
    }
}
