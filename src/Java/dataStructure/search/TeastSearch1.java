package Java.dataStructure.search;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/9/21
 * @Description: Java.dataStructure.search
 * @version: 1.0
 * 在分数中查询指定的索引
 */
public class TeastSearch1 {
    public static void main(String[] args) {
        //给定分数数组
        int[] scoreArr = {89,45,78,45,100,98,86,100,65};
        //给定查找分数
        int score = 100;
        //完成查找
        int index = search(scoreArr, score);
        //输出结果
        if(index == -1){
            System.out.println("fen shu bu cun zai ");
        }else {
            System.out.println("sou yin shi " + index);
        }
    }
    private static int search(int[] scoreArr, int score){
        int index = -1;
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] == score){
                index = i;
                break;
            }
        }
        return index;
    }
}
