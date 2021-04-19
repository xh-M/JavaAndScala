package tititit;

/**
 * 给定一个数组序列, 需要求选出一个区间, 使得该区间是所有区间中经过如下计算的值最大的一个：
 * 区间中的最小数 * 区间所有数的和最后程序输出经过计算后的最大值即可，不需要输出具体的区间。
 * 如给定序列  [6 2 1]则根据上述公式, 可得到所有可以选定各个区间的计算值:
 * [6] = 6 * 6 = 36;
 * [2] = 2 * 2 = 4;
 * [1] = 1 * 1 = 1;
 * [6,2] = 2 * 8 = 16;
 * [2,1] = 1 * 3 = 3;
 * [6, 2, 1] = 1 * 9 = 9;
 * 从上述计算可见选定区间 [6] ，计算值为 36， 则程序输出为 36。
 * 区间内的所有数字都在[0, 100]的范围内;
 */
public class FindMaxInArray {
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int[] arr = {6};
        int max1 = findMax(arr);
        System.out.println(max1);

    }
    static int findMax(int[] arr){
        if(arr.length == 0 || arr == null) return 0;
        int result = arrMin(arr) * arrSum(arr);
        if(result > max) max = result;
        return result;
    }

    static int arrMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min =arr[i];
            }
        }
        return min;
    }

    static int arrSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return  sum;
    }
}
