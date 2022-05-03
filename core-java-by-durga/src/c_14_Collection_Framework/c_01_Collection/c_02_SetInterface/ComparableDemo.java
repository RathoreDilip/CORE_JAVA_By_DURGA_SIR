package c_14_Collection_Framework.c_01_Collection.c_02_SetInterface;

public class ComparableDemo {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z")); // -25
        System.out.println("Z".compareTo("K")); // 15
        System.out.println("A".compareTo("A")); // 0
    }
}
