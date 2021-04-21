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

class People{
    private People() {
        this.age = 10;
    }

    private int age;
    private volatile static People people;

    public static People getInstance(){
        if(people == null){
            //A和B
            synchronized (People.class) {
                if (people == null) {
                    //1. 加载类型信息到方法区
                    //2. 在堆内存为新对象分配空间
                    //3. 为对象属性赋 零 值 0 ,null
                    //4. 设置对象头 (GC年龄, synchronized, 类型指针 -> 方法区中的类型信息 等等)

                    //6. people => new People();

                    //5. 执行对象的构造方法 init()
                    //指令重排序,  得到属性值为 零 值的对象
                    people = new People();
                }
            }
        }
        return people;
    }
}
