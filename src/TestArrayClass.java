import java.io.PrintStream;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/17
 */
public class TestArrayClass {
    public static void main(String[] args) {

        String string = "hello world";

        PrintStream out = System.out;
        out.println(string.toString());
    }
}
class People{
    int age;
    int name;

    public People(int age, int name) {

        this.age = age;
        this.name = name;
    }

    public People() {
    }
}
