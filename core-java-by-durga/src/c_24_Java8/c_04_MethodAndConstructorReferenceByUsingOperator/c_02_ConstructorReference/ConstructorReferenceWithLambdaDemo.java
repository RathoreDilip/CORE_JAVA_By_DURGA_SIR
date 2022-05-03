package c_24_Java8.c_04_MethodAndConstructorReferenceByUsingOperator.c_02_ConstructorReference;

class Sample{
    Sample(){
        System.out.println("Sample Constructor execution & Object creation..");
    }
}

interface Interf{
    public Sample get();
}

public class ConstructorReferenceWithLambdaDemo {
    public static void main(String[] args) {
        Interf i=()->{
                        Sample s=new Sample();
                        return s;
                     };
        Sample s1=i.get();
    }
}
