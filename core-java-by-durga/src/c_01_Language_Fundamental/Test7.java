package c_01_Language_Fundamental;

import java.util.HashMap;

// humancloud
//
public class Test6 {
    public static void main(String[] args) {
        String str="humancloudddd";
        int count=0;
        char key='\0';
        HashMap<Character,Integer> map=new HashMap();
        for (int i = 0; i <str.toCharArray().length ; i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                if(count<=map.get(str.charAt(i))) {
                    count = map.get(str.charAt(i));
                    key=str.charAt(i);
                }
            }
            else
                map.put(str.charAt(i),1);
        }
        System.out.println(map);
        System.out.println(count);
        System.out.println(key);
    }
}
