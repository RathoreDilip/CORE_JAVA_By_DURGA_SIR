package c_24_Java8.c_01_LambdaExpression.c_03_AnonymousInnerClass.Example2;

interface Interf{
    public void m1();
}

public class WithAnonymousClassInstanceVariable {
    int x=888;
    public void m2(){
        // Anonymous Inner class
        Interf i=new Interf() {
            int x=999;
            @Override
            public void m1() {
                System.out.println("this.x : "+this.x);  // it is referenced current anonymous inner class
                System.out.println("Test.this.x : "+WithAnonymousClassInstanceVariable.this.x); // it is referenced outer class
            }
        };
        i.m1();
    }

    public static void main(String[] args) {
        WithAnonymousClassInstanceVariable obj=new WithAnonymousClassInstanceVariable();
        obj.m2();
    }
}
