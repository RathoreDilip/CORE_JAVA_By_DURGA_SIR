package c_02_Operators_And_Assignments.com;

// listen silent tinsel operator
// 256
// [0 to 256]
// 78 -> 1, 1
// 1,1,
// sdeshmuk@ptc.com
//

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the number of string. : ");
        int n=scanner.nextInt();
        String[] arr=new String[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element : "+(i+1)+" :");
            arr[i]=scanner.next();
        }

        boolean[] result=addAnagram(arr);
        int countAnagrams=0;
        // print anagrams
        for (int i = 0; i <result.length ; i++) {
            if(result[i]==true) {
                System.out.print(arr[i]+" ");countAnagrams++;
            }
        }

        if(countAnagrams==0)
            System.out.println("no anagrams found.");
    }

    public static boolean[] addAnagram(String str[]){
        int count=0;
        boolean[] strResult=new boolean[str.length];
        for (int i = 1; i <str.length ; i++) {
            if(areAnagram(str[0],str[i])) {
                strResult[i] = true;count++;
            }
        }
        if(count>=1)
            strResult[0]=true;
        return strResult;
    }

    // check anagrams
    public static boolean areAnagram(String first,String second){
        if(first==null || second==null)
            return false;

        var array1=first.toLowerCase().toCharArray();
        Arrays.sort(array1);

        var array2=second.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1,array2);
    }

}
