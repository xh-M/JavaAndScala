import java.util.Arrays;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/8
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,7,6,5,3,2,8,1};
        int[] ints = mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(ints));
    }

    //返回归并后的集合
    private static int[] mergeSort(int[] arr, int start, int end) {
        if(arr.length == 1) return arr;
        int mid = (start + end) / 2;
        //创建子数组
        int[] leftArr = create(arr,start,mid);
        int[] rightArr = create(arr,mid+1,end);
        int[] left = mergeSort(leftArr, 0, leftArr.length - 1);
        int[] right = mergeSort(rightArr, 0, rightArr.length - 1);
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        //创建新数组, 长度为两个子数组的和
        int[] result = new int[left.length + right.length];
        //p1指向左数组的下标, p2指向右数组的下标, p指向新数组的下标
        int p1 = 0, p2 = 0, p = 0;
        while (p < result.length) {
            if(p1 == left.length){
                while (p2 != right.length){
                result[p] = right[p2];
                p2++;
                }
                break;
            }
            if(p2 == right.length){
                while (p1 != left.length){
                    result[p] = left[p1];
                    p1++;
                }
                break;
            }
            if (left[p1] <= right[p2]) {
                result[p] = left[p1];
                p1++;
            }else {
                result[p] = right[p2];
                p2++;
            }
            p++;
        }
        return result;
    }
    private static int[] create(int[] arr, int start, int end){
        int[] result = new int[end-start+1];
        for (int i = 0; i < result.length; i++){
            result[i] = arr[start++];
        }
        return result;
    }
}
