package finallyCode;

import java.util.Arrays;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/18
 */
public class Sort_Heap {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8};
        buildHeap(arr);
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            downElement(arr,0,i-1);
        }
    }

    private static void buildHeap(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0 ; i--) {
            downElement(arr, i, arr.length - 1);
        }
    }

    private static void downElement(int[] arr, int parentIndex, int length) {
        int chileIndex = 2 * parentIndex + 1;
        while (chileIndex <= length){
            if(chileIndex + 1 <= length && arr[chileIndex+1] < arr[chileIndex])
                chileIndex++;
            if(arr[parentIndex] <= arr[chileIndex])
                return;
            int temp = arr[chileIndex];
            arr[chileIndex] = arr[parentIndex];
            arr[parentIndex] = temp;

            parentIndex = chileIndex;
            chileIndex = 2 * chileIndex +1;
        }
    }
}
