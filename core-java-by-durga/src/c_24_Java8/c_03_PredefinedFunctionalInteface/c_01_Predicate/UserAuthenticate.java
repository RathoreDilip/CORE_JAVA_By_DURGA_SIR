package c_24_Java8.c_03_PredefinedFunctionalInteface.c_01_Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
    String username;
    String pwd;

    public User(String username,String pwd) {
        this.username = username;
        this.pwd=pwd;
    }
}
public class UserAuthenticate {
    public static void main(String[] args) {
        Predicate<User> p=user -> user.username.equals("durga") && user.pwd.equals("java");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter username :");
        String username=sc.nextLine();
        System.out.print("Enter password :");
        String pwd=sc.nextLine();

        User user=new User(username,pwd);
        if(p.test(user))
            System.out.println("valid user,you can got all service");
        else
            System.out.println("invalid user plz login again");
    }
}
