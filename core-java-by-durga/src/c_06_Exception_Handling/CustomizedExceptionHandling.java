package c_06_Exception_Handling;

import java.util.Scanner;

class ToYoungException extends RuntimeException{
    ToYoungException(String s){
        System.out.println(s);
    }
}
class ToOldException extends RuntimeException{
    ToOldException(String s){
        System.out.println(s);
    }
}
public class CustomizedExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter age:");
        int age=sc.nextInt();
        if(age>60)
            throw new ToOldException("Plz wait you are almost 60..");
        else if(age<18)
            throw new ToYoungException("You are to young..");
        else
            System.out.println("you will get matched details...");
    }
}
