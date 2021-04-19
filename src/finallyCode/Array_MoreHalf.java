package finallyCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/19
 */
public class Array_MoreHalf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,2,5,4,2};
        int i = arrayMoreHalf(arr);
        System.out.println(i);
    }

    private static int arrayMoreHalf(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],1);
            }else {
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            Integer integer = hashMap.get(arr[i]);
            if(integer > arr.length / 2)
                return arr[i];
        }
//        Iterator<Map.Entry<Integer, Integer>> iterator = hashMap.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Integer, Integer> next = iterator.next();
//            Integer key = next.getKey();
//            Integer value = next.getValue();
//            if(value > arr.length / 2)
//                return key;
//        }
        return 0;
    }
}
