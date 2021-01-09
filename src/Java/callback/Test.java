package Java.callback;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/9/29
 * @Description: Java.callback
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        B b = new B();
        A a = new A(b);
        a.methodA();
    }
}
