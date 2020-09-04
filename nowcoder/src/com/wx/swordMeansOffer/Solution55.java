package com.wx.swordMeansOffer;

import java.util.ArrayList;
import java.util.List;

public class Solution55 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) return null;
        List<Boolean> list = new ArrayList<>();
        ListNode p = pHead;
        int i = 0;
        while (p != null) {
            if (list.get(i)) {
                return p;
            } else {
                p = p.next;
                list.set(i, true);
                i++;
            }
        }
        return null;
    }
}
