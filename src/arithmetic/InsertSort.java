package arithmetic;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/3/26
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5,7,1,3,6,2,4};
        insertSort(arr);
    }

    private static void insertSort(int[] arr) {

        int[] newArr = new int[arr.length];
        newArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

           for (int j = i - 1; j >= 0; j--) {
               if(arr[i] >= newArr[j]) {
                   newArr[j+1] = arr[i];
                   break;
               }

               newArr[j+1] = newArr[j];
               newArr[j] = arr[i];
           }
        }




        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
