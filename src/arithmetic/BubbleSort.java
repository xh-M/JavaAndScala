package arithmetic;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/3/26
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,8,1,3,6,2,4,7};
        bubbleSort(arr);
    }


    private static void bubbleSort(int[] arr) {
        for (int j = arr.length - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
