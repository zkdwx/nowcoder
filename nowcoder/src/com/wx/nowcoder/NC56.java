package com.wx.nowcoder;

/**
 * 反转链表
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class NC56 {
    public static ListNode ReverseList(ListNode head) {
        if (head == null) return head;
        ListNode p = head;
        ListNode q = head.next;
        if (q == null) {
            return p;
        }
        ListNode r = q.next;
        if (r == null) {
            p = q.next;
            p.next = null;
            return r;
        }
        p.next = null;
        while (r != null) {
            q.next = p;
            p = q;
            q = r;
            r = r.next;
        }
        q.next = p;
        return q;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode head = ReverseList(node1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
