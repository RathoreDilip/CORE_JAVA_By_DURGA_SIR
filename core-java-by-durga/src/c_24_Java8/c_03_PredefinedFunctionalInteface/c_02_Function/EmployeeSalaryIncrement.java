package c_24_Java8.c_03_PredefinedFunctionalInteface.c_02_Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeSalaryIncrement {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        ArrayList<Employee> l=new ArrayList<>();
        TotalMonthlySalaryOfAllEmployee.populate(l);
        System.out.println("--------- Before Increment ---------");
        System.out.println(l);

        // check salary is greater than 15000 or not
        Predicate<Employee> p=e->e.salary<=15000;

        Function<Employee,Employee> f=employee -> {
                employee.salary=employee.salary+477;
                return employee;
        };

        ArrayList<Employee> l2=new ArrayList<>();

        for (Employee e:l) {
            if(p.test(e))
            {
                f.apply(e);
                l2.add(e);
            }
        }

        System.out.println("--------- After Increment ---------");
        System.out.println(l);

        System.out.println("-- Employees with incremented salary --");
        System.out.println(l2);


    }
}
