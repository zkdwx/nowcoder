package com.wx.swordMeansOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class Solution3 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean b = true;
        ListNode p = listNode;
        if (p == null) return list;
        ListNode q = p.next;
        if (q == null) {
            list.add(p.val);
            return list;
        }
        ListNode r = q.next;
        if (r == null) {
            list.add(q.val);
            list.add(p.val);
        } else {
            while (r != null) {
                if (b) {
                    p.next = null;
                    b = false;
                }
                q.next = p;
                p = q;
                q = r;
                r = r.next;
            }
            q.next = p;
            while (q != null) {
                list.add(q.val);
                q = q.next;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ArrayList<Integer> list = printListFromTailToHead(node1);
        for (Integer a : list)
            System.out.println(a);
    }
}
