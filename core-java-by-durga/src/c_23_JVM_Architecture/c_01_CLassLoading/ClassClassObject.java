package c_23_JVM_Architecture.c_01_CLassLoading;

// For Every loaded .class file Only One Class Object will be Created, even though we are
// using Class Multiple Times in Our Application.
public class ClassClassObject {
    public static void main(String[] args) {
        Student s1=new Student();
        Class c1=s1.getClass();
        Student s2=new Student();
        Class c2=s2.getClass();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1==c2);
    }
}
