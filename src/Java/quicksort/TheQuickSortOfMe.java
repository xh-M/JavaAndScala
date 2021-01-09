package Java.quicksort;

import java.util.Arrays;

/**
 * @Auther: 孟祥辉
 * @Date: 2020/11/22
 * @Description: Java.quicksort
 * @version: 1.0
 */
public class TheQuickSortOfMe {
    public static void main(String[] args) {
//        int[] arr = {4,7,6,5,3,2,8,1};
//        quickSort(arr,0,arr.length - 1
//        );
        int[] arr = {5,3,1,7,9,2,4,6,8};
        finallyQuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
//    public static void finallyQuickSort(int[] arr, int left, int right){
//
//        int index = quickSort(arr, left, right);
//        System.out.println("index="+index);
//        int index2 = quickSort(arr, index + 1, right);
//        System.out.println("index2="+index2);
//        int index3 = quickSort(arr, index2 + 1, right);
//        System.out.println("index3="+index3);
//        int index4 = quickSort(arr, index3 + 1, right);
//        System.out.println("index4="+index4);
//        int index5 = quickSort(arr, index4 + 1, right);
//        System.out.println("index5="+index5);
//        System.out.println(right);
//
//    }

    public static void finallyQuickSort(int[] arr, int left, int right){
        if(left >= right) return;
        int index = quickSort(arr, left, right);
        finallyQuickSort(arr,left,index - 1);
        finallyQuickSort(arr,index + 1, right);

    }

    public static int quickSort(int[] arr,int left, int right){
        int pivot = left;
        while (left < right){
            while (left < right && arr[right] >= arr[pivot]){
                right--;
            }
            while (left < right && arr[left] <= arr[pivot]){
                left++;
            }
            int tmp = arr[right];
            if (left == right){
                arr[right] = arr[pivot];
                arr[pivot] = tmp;
            }else {
                arr[right] = arr[left];
                arr[left] = tmp;
            }
        }
        return right;
    }
}
