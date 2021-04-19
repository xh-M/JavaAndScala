package Java.compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/3/20
 */
class People {
    public People(int num) {
        this.num = num;
    }

    int num;
}

public class Test {
    public static void main(String[] args) {

        List<People> list = new ArrayList<>();

        list.add(new People(7));
        list.add(new People(4));
        list.add(new People(1));
//        list.add(new People(5));
//        list.add(new People(6));
//        list.add(new People(3));
//        list.add(new People(0));
//        list.add(new People(8));
//        list.add(new People(9));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).num + " , ");
        }
        System.out.println();


        list.sort(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                int p1 = o1.num;
                System.out.println("p1 = " + p1);
                int p2 = o2.num;
                System.out.println("p2 = " + p2);

                if (p1 < p2) return -1;
                else return -1;
            }
        });

        for (People people : list) {
            System.out.print(people.num + " > ");
        }


    }
}
