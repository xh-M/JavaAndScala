import java.util.Arrays;

/**
 * @Auther: XianghuiMeng @Date: 2021/4/13
 */
public class HeapTest {
    /**
     * 上浮调整
     * @param array 待调整的堆
     */
    public static void upAdjust(int[] array) {
        int childIndex = array.length - 1;
        int parentIndex = (childIndex - 1) / 2;
        while (childIndex > 0 && array[childIndex] < array[parentIndex]) {
            //交换子节点和父节点
            int temp = array[childIndex];
            array[childIndex] = array[parentIndex];
            array[parentIndex] = temp;
            //原父节点变成子节点, 新父节点是原父节点的父节点
            childIndex = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
    }

    /**
     * 下沉调整
     * @param array       待调整的堆
     * @param parentIndex 要下沉的父节点
     * @param length 堆的有效大小
     */
    public static void downAdjust(int[] array, int parentIndex, int length) {
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            /* 如果有右孩子，且右孩子小于左孩子的值，则定位到右孩子*/
            if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex]) {
                childIndex++;
            }
            /* 如果父节点小于任何一个孩子的值，直接跳出*/
            if (array[parentIndex] <= array[childIndex]) {
                break;
            }
            /*无需真正交换，单向赋值即可*/
            int temp = array[parentIndex];
            array[parentIndex] = array[childIndex];//孩子节点的值赋给最后一个叶子节点
            array[parentIndex] = temp;

            parentIndex = childIndex;//孩子节点的下标赋值给最后一个叶子节点的下标
            childIndex = 2 * childIndex + 1;//孩子节点下标变成下一个孩子节点的下标
        }

    }

    /**
     * 构建堆
     * @param array 待调整的堆
     */
    public static void buildHeap(int[] array) {
        /* 从最后一个非叶子节点开始，依次下沉调整*/
        for (int i = array.length / 2; i >= 0; i--) {
            downAdjust(array, i, array.length - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        upAdjust(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{7, 1, 3, 10, 5, 2, 8, 9, 6};
        buildHeap(array);
        System.out.println(Arrays.toString(array));
    }
}
