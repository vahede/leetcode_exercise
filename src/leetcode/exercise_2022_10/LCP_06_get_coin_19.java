package leetcode.exercise_2022_10;

/**
 * @description: 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。
 *              我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 * @author: XianHua Zhou
 * @createDate: 2022/10/19
 * @version: 1.0
 */
public class LCP_06_get_coin_19 {

    public static int minCount(int[] coins) {
//        记数
        int count = 0;
        for (int coin : coins) {
            if (coin < 3) {
                count += 1;
            } else {
                count +=coin / 2;
                if (coin % 2 != 0) {
                    count += 1;
                }
            }


        }
        return count;
    }

    public static void main(String[] args) {
        int[] coins = {2, 3, 5};
        minCount(coins);
    }
}
