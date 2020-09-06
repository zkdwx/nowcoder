package com.wx.nowcoder;

public class NC33 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode phead = head;
        ListNode p = l1;
        ListNode q = l2;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                head.next = p;
                p = p.next;
            } else {
                head.next = q;
                q = q.next;
            }
            head = head.next;
        }

        if (p != null) {
            head.next = p;
        }
        if (q != null) {
            head.next = q;
        }
        return phead.next;
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(3);
        p1.next = p2;

        ListNode q1 = new ListNode(2);
        ListNode q2 = new ListNode(3);
        q1.next = q2;

        mergeTwoLists(p1, q1);

    }
}
