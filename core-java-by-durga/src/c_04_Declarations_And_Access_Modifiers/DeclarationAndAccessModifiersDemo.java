package c_04_Declarations_And_Access_Modifiers;

 class DeclarationAndAccessModifiersDemo{
     static int x=10;
     public void m1(){
         System.out.println(x);
     }
     public static void main(String[] args) {
        DeclarationAndAccessModifiersDemo d=new DeclarationAndAccessModifiersDemo();
        d.m1();
     }
}
