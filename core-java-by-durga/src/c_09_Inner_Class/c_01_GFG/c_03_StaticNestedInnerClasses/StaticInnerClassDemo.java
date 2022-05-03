package c_09_Inner_Class.c_01_GFG.c_03_StaticNestedInnerClasses;

class Outer{

    private static void outerMethod(){
        System.out.println("inside outerMethod..");
    }

    static class StaticInnerClassDemo {
        public static void main(String[] args) {
            System.out.println("inside inner class method..");
            outerMethod();
        }
    }
}

