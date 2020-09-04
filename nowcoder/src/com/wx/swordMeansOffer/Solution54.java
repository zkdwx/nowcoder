package com.wx.swordMeansOffer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution54 {
    //Insert one char from stringstream
    Set<Character> set = new LinkedHashSet<>();

    public void Insert(char ch) {
        if (!set.add(ch)) {
            set.remove(ch);
        }
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        if (set.size() == 0) return '#';
        for (char c : set) {
            return c;
        }
        return '#';
    }
}
