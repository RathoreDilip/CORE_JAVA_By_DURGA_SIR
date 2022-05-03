package c_24_Java8.c_01_LambdaExpression.c_02_Collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
    int eno;
    String ename;

    public Employee(int eno,String ename){
        this.eno=eno;
        this.ename=ename;
    }

    @Override
    public String toString() {
        return eno+":"+ename;
    }
}
public class CustomClassSortingLambdaExpressionDemo {
    public static void main(String[] args) {
        Employee e=new Employee(100,"Durga");
        System.out.println(e);

        ArrayList<Employee> l=new ArrayList<>();
        l.add(new Employee(200,"Deepika"));
        l.add(new Employee(400,"Sunny"));
        l.add(new Employee(300,"Mallika"));
        l.add(new Employee(100,"Katrina"));

        System.out.println("Before Sorting :: "+l); // [200:Deepika, 400:Sunny, 300:Mallika, 100:Katrina]

        Collections.sort(l,(e1,e2)->(e1.eno>e2.eno)?1:(e1.eno<e2.eno)?-1:0);

        System.out.println("After Sorting :: "+l); // [100:Katrina, 200:Deepika, 300:Mallika, 400:Sunny]

    }
}
