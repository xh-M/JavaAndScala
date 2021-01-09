package Java.quicksort;

import java.util.Arrays;

/**
 * @Auther: 孟祥辉
 * @Date: 2020/11/23
 */
public class FinallyQuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 7, 9, 2, 4, 6, 8};
        myQuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void myQuickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int index = quickSort(arr, left, right);
        myQuickSort(arr, left, index - 1);
        myQuickSort(arr, index + 1, right);
    }

    public static int quickSort(int[] arr, int left, int right) {
        int pivot = left;
        while (left < right) {
            while (left < right && arr[right] >= arr[pivot]) {
                right--;
            }
            while (left < right && arr[left] <= arr[pivot]) {
                left++;
            }
            int tmp = arr[right];
            arr[right] = arr[left];
            arr[left] = tmp;
        }
        int tmp = arr[right];
        arr[right] = arr[pivot];
        arr[pivot] = tmp;
        return right;
    }
}
