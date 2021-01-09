package Java.quicksort;

import java.util.Arrays;

/**
 * @Auther: 孟祥辉
 * @Date: 2020/11/7
 * @Description: Java.quicksort
 * @version: 1.0
 */
public class MyQuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{1332802,1177178,1514891,871248,753214,123866,1615405,328656,1540395,968891,1884022,252932,1034406,1455178,821713,486232,860175,1896237,852300,566715,1285209,1845742,883142,259266,520911,1844960,218188,1528217,332380,261485,1111670,16920,1249664,1199799,1959818,1546744,1904944,51047,1176397,190970,48715,349690,673887,1648782,1010556,1165786,937247,986578,798663};
        quickSort(array,0,array.length - 1);
        System.out.println(array[24 - 1]);

    }
    public static void quickSort(int[] array, int start, int end){
        if (start >= end) return;

        int pivot = partition(array, start, end);

        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    //
    public static int partition(int[] array, int start, int end){
        int pivot = start;

        while (start != end){
            //先控制右指针左移
            while (start < end && array[end] < array[pivot]) {
                end--;
            }
            //再控制左指针右移
            while (start < end && array[start] >= array[pivot]){
                start++;
            }
            //出循环后左右指针指向需要交换位置的元素，交换位置
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
        }
        //左右位置交换后将end与pivot位置交换
        int temp = array[end];
        array[end] = array[pivot];
        array[pivot] = temp;
        //返回pivot
        return end;
    }



}
