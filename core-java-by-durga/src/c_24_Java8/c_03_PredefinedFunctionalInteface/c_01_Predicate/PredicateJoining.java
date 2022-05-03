package c_24_Java8.c_03_PredefinedFunctionalInteface.c_01_Predicate;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        int x[]={0,5,10,15,20,25,30};

        // number is greater than 10
        Predicate<Integer> p1=i->i>10;
        // even numbers
        Predicate<Integer> p2=i->(i%2==0);

        System.out.println("The numbers greater than 10 are ");
        display(p1,x);
        System.out.println("The even numbers are ");
        display(p2,x);
        System.out.println("The numbers not greater than 10 are");
        display(p1.negate(),x);
        System.out.println("The numbers not greater than 10 and even are");
        display(p1.and(p2),x);
        System.out.println("The numbers not greater than 10 or even are");
        display(p1.or(p2),x);

    }

    public static void display(Predicate<Integer> p,int[] x){
        for (int x1:x) {
            if(p.test(x1))
                System.out.println(x1);
        }
    }
}
