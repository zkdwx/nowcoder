package com.wx.nowcoder;

import java.util.HashSet;
import java.util.Set;

public class NC66 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Set<ListNode> set = new HashSet<>();
        while (pHead1 != null) {
            set.add(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            boolean b = set.add(pHead2);
            if (!b) return pHead2;
            pHead2 = pHead2.next;
        }
        return null;
    }
}
