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

class Singleton {
    private Singleton(){}

    private static volatile Singleton singleton;

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
