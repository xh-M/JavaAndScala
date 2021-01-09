package Java.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @Auther: 孟祥辉
 * @Date: 2020/11/12
 * @Description: Java.hashmap
 * @version: 1.0
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"one");
        map1.put(2,"two");
        map1.put(3,"three");
        map1.put(null,null);
        map1.put(5,null);
        map1.put(null,"six");
        System.out.println(map1.get(null));
//        Hashtable


    }
}
