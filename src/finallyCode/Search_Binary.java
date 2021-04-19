package finallyCode;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/19
 */
public class Search_Binary {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,3,3,3,3,8,9};
        int i = binarySearch(arr1, 7);
        int i1 = binarySearchLeft(arr2, 3);
        int i2 = binarySearchRight(arr2, 3);
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
    }

    private static int binarySearchRight(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while(left < right){
            int mid  = left + (right - left) / 2;
            if(arr[mid] == target){
                left = mid + 1;
            }else if(arr[mid] > target){
                right = mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }
        }
        return left - 1;
    }


    private static int binarySearchLeft(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                right = mid;
            }else if(arr[mid] > target){
                right = mid;
            }else if(arr[mid] < target){
                left  = mid + 1;
            }
        }
        return left;
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
               right = mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }
        }
        return -1;
    }


}
