package Java.singleton;

/**
 * @Auther: 孟祥辉
 * @Date: 2020/11/12
 * @Description: Java.singleton
 * @version: 1.0
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank instance = Bank.getInstance();
        Bank instance1 = Bank.getInstance();
        System.out.println(instance == instance1);

    }
}

class Bank {
   private Bank() {

   }
   private static Bank bank;

   public static Bank getInstance(){
       if(bank == null){
           bank = new Bank();
       }
       return bank;
   }
}
