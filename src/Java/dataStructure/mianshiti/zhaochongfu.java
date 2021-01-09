package Java.dataStructure.mianshiti;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/10/6
 * @Description: Java.dataStructure.mianshiti
 * @version: 1.0
 */
public class zhaochongfu {
    public static void main(String[] args) {
        int[] arr = {0,9,4,1,4,3};
        int repeatNumber = getRepeatNumber(arr);
        System.out.println(repeatNumber);

    }
    public static int getRepeatNumber(int[] arr){
        if (arr == null || arr.length == 0) return -1;
        for (int i = 0; i < arr.length;) {
            if (arr[i] < 0 || arr[i] >= arr.length) return -1;
            if (arr[i] == i) i++;
            else {
                if (arr[i] == arr[arr[i]]) return arr[i];
                else {
                    int temp = arr[i];
                    arr[i] = arr[arr[i]];
                    arr[temp] = temp;
                }
            }
        }
        return -1;
    }
}
