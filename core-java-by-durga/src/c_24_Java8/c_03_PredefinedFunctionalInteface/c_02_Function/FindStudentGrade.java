package c_24_Java8.c_03_PredefinedFunctionalInteface.c_02_Function;

import java.util.ArrayList;
import java.util.function.Function;

class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class FindStudentGrade {
    public static void main(String[] args) {
        ArrayList<Student> l=new ArrayList<>();
        populate(l);

        Function<Student,String> f=s->{
                            if(s.marks>=80)
                                return "A[Distinct]";
                            else if(s.marks>=60)
                                return "B[First Class]";
                            else if(s.marks>=50)
                                return "C[Seconf Class]";
                            else if(s.marks>=35)
                                return "D[Third Class]";
                            else
                                return "E[Failed]";
                        };

        for (Student s:l) {
            System.out.println(s.name);
            System.out.println(f.apply(s));
        }

    }

    private static void populate(ArrayList<Student> l) {
        l.add(new Student("Sunny",100));
        l.add(new Student("Bunny",65));
        l.add(new Student("Chinny",55));
        l.add(new Student("Vinny",45));
        l.add(new Student("Pinny",25));
    }
}
