package com.wx.nowcoder;

public class NC4 {
    //方法一：快慢指针
    public boolean hasCycle1(ListNode head) {
        if (head == null) return false;
        ListNode p = head;
        ListNode q = head;
        while (p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                return true;
            }
        }
        return false;
    }

    //方法二：哈希法（类似）
    public boolean hasCycle2(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return false;
        ListNode p = head;
        ListNode q = head.next;
        while (q != null) {
            p.next = head;
            p = q;
            q = q.next;
            if (q == head) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode tail = new ListNode(2);
        head.next = tail;

        NC4 nc = new NC4();
        boolean b = nc.hasCycle1(head);
        System.out.println(b);
    }
}
