import java.util.Arrays;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/13
 */
public class BuildHeap {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 3, 10, 5, 2, 8, 9, 6};
        heapSort(arr);
        System.out.println("堆排序后结果: " + Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        for (int i = (arr.length - 1)/2 ; i >= 0; i--) {
            downElement(arr, i, arr.length - 1);
        }
        System.out.println("把数组变成二叉堆: " + Arrays.toString(arr));
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            downElement(arr, 0, i-1);
        }
    }
    public static void downElement(int[] arr, int parentIndex, int lastIndex){
        int childIndex = 2 * parentIndex + 1;
        while (childIndex <= lastIndex){
            if(childIndex + 1 <= lastIndex && arr[childIndex + 1] < arr[childIndex])
                childIndex++;
            if(arr[parentIndex] < arr[childIndex]) return;

            int temp = arr[childIndex];
            arr[childIndex] = arr[parentIndex];
            arr[parentIndex] = temp;

            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
    }
}

