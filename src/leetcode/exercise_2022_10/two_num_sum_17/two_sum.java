package leetcode.exercise_2022_10.two_num_sum_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @description: 两数之和
 * @author: ZhouXianHua
 * https://leetcode.cn/problems/add-two-numbers/
 * @date: 2022/10/17 13:24
 */
public class two_sum {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            定义一个头指针
            ListNode zroe = new ListNode(0);
            ListNode curr = zroe;
            int currNum = 0;
            while (l1 != null || l2 != null) {
                int valu1 = l1 == null ? 0 : l1.val;
                int valu2 = l2 == null ? 0 : l2.val;
                int sum = valu1 + valu2+currNum;

                 currNum = sum / 10;
                 sum =sum % 10;
                curr.next = new ListNode(sum);
                curr = curr.next;
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }

                if (currNum == 1) {
                    curr.next = new ListNode(currNum);
                }

            }
            return zroe.next;
        }
    }

}
