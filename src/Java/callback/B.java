package Java.callback;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/9/29
 * @Description: Java.callback
 * @version: 1.0
 */
public class B {
//    public void methodB(CallBack callBack){
//        System.out.println("这里是B类的方法b，即将调用A类的回调方法");
//        callBack.callBack();
//    }
    public void methodB(A a){
        System.out.println("这里是B类的方法b，即将调用A类的回调方法");
        a.callBack();
    }
}
