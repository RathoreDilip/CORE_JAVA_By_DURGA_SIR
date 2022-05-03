package c_01_Language_Fundamental;

import java.util.Arrays;
import java.util.HashMap;

// I am a java developer
// I ma a avaj re
public class Test {
    public static void main(String[] args) {
        String str="I am a java developer";
        String[] a=str.split(" ");
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
          // System.out.println(a[i]);
            StringBuffer st=new StringBuffer(a[i]);
            System.out.println(st.reverse());
        }

  //      test(10);

        high();

//        HashMap<String,String> hashMap = new HashMap<>();
//
//        hashMap.put(null, "nullValue");
//        hashMap.put("abc","xy");
//        hashMap.put(null,"nullValue2");
//        System.out.println(hashMap);

    }
//    public static void test(int n){
//        if(n==0)
//            return;
//        else {
//            test(n - 1); // recursion
//            System.out.println(n);
//        }
//    }

// array[] arr=new arr[30]
// 30,20,70,60,40,50,80,90,10
// 80,90
// 30 -> H 90 SH 80


    public static void high(){
        int arr[]={30,20,70,60,40,50,80,90,10};
        int max=0;
        int smax=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<=max && arr[i]>smax) {
                smax = arr[i];
            }
        }
        System.out.println("maximum :: "+max);
        System.out.println("second maximum :: "+smax);
    }



}
