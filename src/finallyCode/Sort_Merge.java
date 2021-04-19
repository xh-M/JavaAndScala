package finallyCode;

import java.util.Arrays;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/18
 */
public class Sort_Merge {
    public static void main(String[] args) {
        int[] arr = { 1,6,2,7,3,4,5,8,9};
        int[] result = mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(result));
    }

    private static int[] mergeSort(int[] arr, int start, int end) {
        if (arr.length == 1) return arr;
        int mid = (start + end) / 2;
        int[] leftArr = getArr(arr, start, mid);
        int[] rightArr = getArr(arr, mid + 1, end);

        int[] leftResult = mergeSort(leftArr, 0, leftArr.length - 1);
        int[] rightResult = mergeSort(rightArr, 0, rightArr.length - 1);
        return merge(leftResult,rightResult);
    }

    private static int[] merge(int[] leftArr, int[] rightArr) {
        int[] result = new int[leftArr.length + rightArr.length];
        int left = 0;
        int right = 0;
        int index = 0;
        while (left < leftArr.length && right < rightArr.length){
            if(leftArr[left] < rightArr[right]){
                result[index] = leftArr[left];
                left++;
            }else {
                result[index] = rightArr[right];
                right++;
            }
            index++;
        }
        if(left > right){
            while (right < rightArr.length){
                result[index] = rightArr[right];
                right++;
                index++;
            }
        }else {
            while (left < leftArr.length){
                result[index] = leftArr[left];
                left++;
                index++;
            }
        }

        return result;
    }

    private static int[] getArr(int[] arr, int start, int end) {
        int[] newArr = new int[end - start + 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[start];
            start++;
        }
        return newArr;
    }
}
