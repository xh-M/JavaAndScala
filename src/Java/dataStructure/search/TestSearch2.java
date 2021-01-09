package Java.dataStructure.search;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/9/21
 * @Description: Java.dataStructure.search
 * @version: 1.0
 */
public class TestSearch2 {
    //顺序结构 ，有序排列
    public static void main(String[] args) {
        //给定数组
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //给定查找值
        int key = 11;
        //进行折半查找
//        int index = binarySearch(array, key);

        int index = binarySerach2(array, 0, array.length - 1, key);

        //输出结果
        if (index == -1) {
            System.out.println("bu cun zai ");
        }
        else {
            System.out.println("sou yin shi " + index);
        }
    }

    //不使用递归
    public static int binarySearch(int[] array, int key) {
        //指定low和high
        int low = 0;
        int high = array.length - 1;
        //折半查找
        while (low <= high) {
            //求得mid
            int mid = (low + high) / 2;
            //判断是否等于
            if (key == array[mid]) {
                return mid;
            }
            else if (key < array[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    //使用递归
    public static int binarySerach2(int[] array, int low, int high, int key) {
        //递归结束的条件
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (key == array[mid]) {
            return mid;
        }
        //递归开始的条件
        else if (key < array[mid]) {
            return binarySerach2(array, low, mid - 1, key);
        }
        else {
            return binarySerach2(array, mid + 1, high, key);
        }
    }
}
