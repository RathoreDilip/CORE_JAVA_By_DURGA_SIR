package c_01_Language_Fundamental;

import java.util.Arrays;
import java.util.HashSet;

// second largest element from given array
public class Test3 {
    public static void main(String[] args) {
        int[] arr={11,9,7,11,2}; // 5,1,6,5,8,10
        System.out.println(smax(arr));
    }
    public static int smax(int []arr){
        System.out.println(Arrays.toString(arr));
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) { // 0 1
//            if(arr[i]>max) // 11 > 0 => max=11 => 5 > 11
//                max=arr[i];
//            else if(arr[i]>=secMax && arr[i]<max) // 5>=0 && 5<11 ==> secMax=5
//                secMax=arr[i];
//        }
//        System.out.println("Maximum :: "+max);
//        System.out.println("Second maximum :: "+secMax);
       if(arr.length<2) {
          // System.out.println("please enter more than 1 elements...");
           throw new RuntimeException("please enter more than 1 elements");
          // System.exit(0);
       }
        Arrays.sort(arr); // 2,7,11,11,11

        HashSet set=new HashSet();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);

        if(arr[arr.length-1]==arr[arr.length-2])
            secMax=arr[arr.length-3];
        else
            secMax=arr[arr.length-2];

        return secMax;
    }
}
