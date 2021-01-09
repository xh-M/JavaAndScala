package Java.dataStructure.mianshiti;

import java.util.Arrays;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/10/2
 * @Description: Java.dataStructure.mianshiti
 * @version: 1.0
 */
public class fanzhuanshuzhu {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};
//        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length / 2; i++) {
//            newArr[i] = arr[arr.length - 1 - i];
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
