package c_24_Java8.c_03_PredefinedFunctionalInteface.c_01_Predicate;

import java.util.function.Predicate;

class SoftwareEngineer{
    String name;
    int age;
    boolean isHavingGf;

    public SoftwareEngineer(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class SoftwareEngineerAllowPubOrNot {
    public static void main(String[] args) {
        SoftwareEngineer[] list={new SoftwareEngineer("Dilip",25,true),
                                new SoftwareEngineer("Deep",15,true),
                                new SoftwareEngineer("Dipak",20,false),
                                new SoftwareEngineer("Raju",22,false),
                                new SoftwareEngineer("Raja",23,true)};

        Predicate<SoftwareEngineer> p=se->se.age>=18 && se.isHavingGf==true;

        for (SoftwareEngineer se:list) {
            if(p.test(se))
                System.out.println(se);
        }



    }
}
