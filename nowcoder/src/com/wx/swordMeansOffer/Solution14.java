package com.wx.swordMeansOffer;

public class Solution14 {
    public static ListNode FindKthToTail(ListNode head, int k) {
        ListNode p = head;
        ListNode q = head;
        int n = 0;
        while (p.next != null) {
            n++;
            p = p.next;
        }
        System.out.println(n);
        int count = n - k;
        while (count >= 0) {
            q = q.next;
            count--;
        }
        return q;
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(1);
        ListNode node3=new ListNode(1);
        ListNode node4=new ListNode(1);
        ListNode node5=new ListNode(1);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

        FindKthToTail(node1,3);

    }
}
