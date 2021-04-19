package finallyCode;

import java.util.Arrays;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/18
 */
public class Sort_Quick {
    public static void main(String[] args) {
        int[] arr = {1,3,6,9,2,4,5,8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }


    public static void quickSort(int[] arr, int start, int end){
        if(start >= end) return;

        int index = getIndex(arr, start, end);

        quickSort(arr, 0, index);
        quickSort(arr, index + 1,end);
    }

    private static int getIndex(int[] arr, int start, int end) {
        int value = start;
        int left = start;
        int right = end;
        while (left < right){
            while (left < right && arr[right] >= arr[value]){
                right--;
            }
            while (left < right && arr[left] <= arr[value]){
                left++;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int temp = arr[value];
        arr[value] = arr[left];
        arr[left] = temp;
        return left;
    }
}
