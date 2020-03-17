package com.wx.swordMeansOffer;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution2 {
    public static String replaceSpace(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        String s = str.toString();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                sb.append("%20");
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuffer str= new StringBuffer("We   Are Happy");
        System.out.println(replaceSpace(str));
    }
}
