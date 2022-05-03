package c_01_Language_Fundamental;

public class Test5 implements A,B {

    @Override
    public void add() {
        System.out.println("Test 5");
    }

    public static void main(String[] args) {
        A a=new Test5();
        a.add();
    }

}

interface A{
    public void add();
}
interface B{
    public void add();
}
