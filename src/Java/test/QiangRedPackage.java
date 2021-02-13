package Java.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/2/11
 */
public class QiangRedPackage {
    public static List<Integer> divideRedPackage(Integer totalAmount, Integer totalPeopleNum){
        List<Integer> amountList = new ArrayList<Integer>();
        Integer resAmount = totalAmount;
        Integer resPeopleNum = totalPeopleNum;
        Random random = new Random();
        for(int i = 0; i < totalPeopleNum - 1; i++){
            int amount = random.nextInt(resAmount / resPeopleNum * 2 - 1) + 1;
            resAmount -= amount;
            resPeopleNum --;
            amountList.add(amount);
        }
        amountList.add(resAmount);
        return amountList;
    }
    public static void main(String[] args){
        Integer totalAmount = new Integer(10000);
        Integer totalPeopleNum = new Integer(10);
        List<Integer> amountList = divideRedPackage(totalAmount, totalPeopleNum);
        System.out.println("红包总额 = " + totalAmount/100 + ",人数 = " + totalPeopleNum);
        for(Integer amount : amountList){
            totalAmount -= amount;
            System.out.println("抢到金额：" + new BigDecimal(amount).divide(new BigDecimal(100))
                    + ", 剩余总额: " + new BigDecimal(totalAmount).divide(new BigDecimal(100)));
        }

    }
}
