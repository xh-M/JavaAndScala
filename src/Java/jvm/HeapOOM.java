package Java.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: XianghuiMeng
 * @Date: 2020/11/25
 */
public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
