package Java.singleton;

/**
 * @Auther: 孟祥辉
 * @Date: 2020/11/12
 * @Description: Java.singleton
 * @version: 1.0
 */
public class SingletonTest2 {
    public static void main(String[] args) {

    }
}
class Apple {
    private Apple() {
    }
    private static Apple apple = null;
    public static Apple getInstance(){
        if (apple == null){
            apple = new Apple();
        }
        return apple;
    }

}
