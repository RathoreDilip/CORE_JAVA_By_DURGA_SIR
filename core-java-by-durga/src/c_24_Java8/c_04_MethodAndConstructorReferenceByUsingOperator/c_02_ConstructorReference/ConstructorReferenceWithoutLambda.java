package c_24_Java8.c_04_MethodAndConstructorReferenceByUsingOperator.c_02_ConstructorReference;

class Sample1{
    Sample1(){
        System.out.println("Sample1 Constructor execution & Object creation..");
    }
}

interface Interf1{
    public Sample1 get();
}

public class ConstructorReferenceWithoutLambda {
    public static void main(String[] args) {
        Interf1 i=Sample1::new;
        Sample1 s=i.get();
    }
}
