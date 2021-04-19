package arithmetic;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/3/28
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,2,2,3};

        int result1 = find(arr1, 5);
//        int result2 = find(arr2, 2);
//        int result3 = findLeft(arr2, 2);
//        int result4 = findRight(arr2, 2);

        System.out.println("数字在数组arr1中的索引是: " + result1);
//        System.out.println("数字2在数组arr2中的索引是: " + result2);
//        System.out.println("数字2在数组arr2中的左边界索引是: " + result3);
//        System.out.println("数字2在数组arr2中的右边界索引是: " + result4);
    }

    private static int findRight(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while(left < right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == target){
                left = mid + 1;
            }else if (arr[mid] < target){
                left = mid + 1;
            }else if (arr[mid] > target){
                right = mid;
            }
        }
        return left - 1;
    }



    private static int findLeft(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                right = mid;
            }else if (arr[mid] < target){
                left = mid + 1;
            }else if (arr[mid] > target){
                right = mid;
            }
        }
        return left;
    }



    private static int find(int[] arr1, int target) {
        int left = 0;
        int right = arr1.length;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(arr1[mid] == target){
                return  mid;
            }else if(arr1[mid] < target){
                left = mid + 1;
            }else if(arr1[mid] > target){
                right = mid;
            }
        }
        return  -1;
    }
}
