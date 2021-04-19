package arithmetic;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/3/28
 */
public class KoKoEatBanana_BinarySearch {


    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        KoKoEatBanana_BinarySearch kk = new KoKoEatBanana_BinarySearch();
        int i = kk.minEatingSpeed(piles, 8);
        System.out.println(i);

        int[][] a = new int[3][4];
        System.out.println(a.length);
    }

    //主要方法
    int minEatingSpeed(int[] piles, int H) {
//        // piles 数组的最大值
//        int max = getMax(piles);
//        for (int speed = 1; speed < max; speed++) {
//            // 以 speed 是否能在 H 小时内吃完香蕉
//            if (canFinish(piles, speed, H))
//                return speed;
//        }
//        return max;
        int left = 0;
        int right = getMax(piles) + 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if( canFinish(piles, mid, H)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    boolean canFinish(int[] piles, int speed, int H) {
        int time = 0;
        for (int n : piles) {
            time += timeOf(n, speed);
        }
        return time <= H;
    }

    int timeOf(int n, int speed) {// 8 / 7
        return (n / speed) + ((n % speed > 0) ? 1 : 0);
    }

    int getMax(int[] piles) {
        int max = 0;
        for (int n : piles)
            max = Math.max(n, max);
        return max;
    }



}

