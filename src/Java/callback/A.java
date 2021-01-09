package Java.callback;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/9/29
 * @Description: Java.callback
 * @version: 1.0
 */
public class A implements CallBack{
    private B b;

    public A(B b) {
        this.b = b;
    }

    public void methodA(){
        System.out.println("A类开始调用B类的方法b");
        b.methodB(this);
    }

    @Override
    public void callBack() {
        System.out.println("这里是A类回调方法");
    }
}
