package c_24_Java8.c_03_PredefinedFunctionalInteface.c_02_Function;

import java.util.Scanner;
import java.util.function.Function;

public class UserAuthenticate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter username : ");
        String username=sc.next();
        System.out.print("Enter password");
        String password=sc.next();

        Function<String,String> f1=s->s.substring(0,5);
        Function<String,String> f2=s->s.toLowerCase();

        if(f1.andThen(f2).apply(username).equals("durga") && password.equals("java"))
            System.out.println("valid user");
        else
            System.out.println("invalid user");
    }
}
