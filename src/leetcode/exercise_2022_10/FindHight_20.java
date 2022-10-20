package leetcode.exercise_2022_10;

/**
 * @description: 找到最高海拔
 * 有一个自行车手打算进行一场公路骑行，这条路线总共由 n + 1 个不同海拔的点组成。自行车手从海拔为 0 的点 0 开始骑行。
 *
 * 给你一个长度为 n 的整数数组 gain ，其中 gain[i] 是点 i 和点 i + 1 的 净海拔高度差（0 <= i < n）。请你返回 最高点的海拔 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-the-highest-altitude
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: XianHua Zhou
 * @createDate: 2022/10/20
 * @version: 1.0
 */
public class FindHight_20 {

    public int largestAltitude(int[] gain) {
        int result = 0;
        int initNum = 0;
        for (int num : gain) {
            initNum=initNum + num;
            result = result > initNum ? result : initNum;
        }
        return result;
    }
}
