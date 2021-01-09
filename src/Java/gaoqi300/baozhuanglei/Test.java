package Java.gaoqi300.baozhuanglei;


import java.util.HashMap;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/10/14
 * @Description: Java.gaoqi300.baozhuanglei
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Integer int1 = 123;
        Integer int2 = 123;
        System.out.println(int1 == int2);//true，因为123在缓存范围内
        System.out.println(int1.equals(int2));//true
        Integer int3 = 1234;
        Integer int4 = 1234;
        System.out.println(int3 == int4);//false，因为1234不在缓存范围内
        System.out.println(int3.equals(int4));//true
        Integer a = Integer.valueOf(5);
        new HashMap<Object,Object>();
    }
}
