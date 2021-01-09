package Java.dataStructure.mianshiti;

import java.util.Arrays;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/10/6
 * @Description: Java.dataStructure.mianshiti
 * @version: 1.0
 */
public class jishuzaioushuqianmian {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        replaceOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void replaceOrderArray(int[] arr){
        int min = 0;
        int max = arr.length - 1;
        while (min < max){
            while (min < max && arr[min] % 2 != 0) min++;
            while (min < max && arr[max] % 2 == 0) max--;
            if (min != max){
                int temp = arr[min];
                arr[min] = arr[max];
                arr[max] = temp;
            }
        }
    }
}
