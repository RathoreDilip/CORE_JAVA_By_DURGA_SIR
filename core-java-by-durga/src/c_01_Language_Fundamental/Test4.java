package c_01_Language_Fundamental;


class Derived
{
    public void getDetails()
    {
        System.out.println("Derived class");
    }
}

public class Test4 extends Derived
{
//    protected void getDetails()
//    {
//        System.out.println("Test class");
//    }
    public static void main(String[] args)
    {
        Derived obj = new Test4();
        obj.getDetails();
    }
}
