package c_10_Java_Lang_Package.c_01_ObjectClass;

import java.util.Arrays;

class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student s= (Student) obj;
            if(name.equals(s.name) && rollno==s.rollno)
                return true;
            else
                return false;
        }else
            return false;
    }

}

public class ToEqualsDemo {
    public static void main(String[] args) {
        Student s1=new Student("durga",101);
        Student s2=new Student("pavan",102);
        Student s3=new Student("durga",101);
        Student s4=s1;

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // true
        System.out.println(s1.equals("durga")); // false
        System.out.println(s1.equals(null)); // false

        int[] arr1=new int[5];
        int[] arr2=new int[5];
        System.out.println(arr1==arr2); // false
        System.out.println(arr1.equals(arr2)); // false
        System.out.println(Arrays.equals(arr1,arr2)); // true

    }
}
