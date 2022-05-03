package c_23_JVM_Architecture.c_02_TypesOfClassLoader;

public class ClassLoadingSearchingDemo {
    public static void main(String[] args) {
        // bootstrap class loader is not java object i.e. show null
        System.out.println(String.class.getClassLoader());
        System.out.println(ClassLoadingSearchingDemo.class.getClassLoader());
        System.out.println(Customer.class.getClassLoader());
    }
}
