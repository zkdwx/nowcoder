package com.wx.test;
/**
 * read read[addr=0x17,mask=0xff,val=0x7],read_his[addr=0xff,mask=0xff,val=0x1],read[addr=0xf0,mask=0xff,val=0x80]
 */

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String[] address = arr[1].split("],");      //每组地址信息
        for (int i = 0; i < key.length() && i<address.length; i++) {
            String add = address[i].substring(0, key.length());
            if (key.equals(add) && address[i].charAt(key.length()) == '[') {
                show(address[i]);
            }
        }
    }

    private static void show(String address) {
        StringBuilder sb = new StringBuilder();
//        read[addr=0x17,mask=0xff,val=0x7
        String[] arr = address.split(",");
        //read[addr=0x17 arr[0]
        String[] addArrr = arr[0].split("=");
        String addr = addArrr[1];
        sb.append(addr).append(" ");
        String[] maskArr = arr[1].split("=");
        String mask = maskArr[1];
        sb.append(mask).append(" ");
        String[] valArr = arr[2].split("=");
        String val = valArr[1];
        val = val.substring(val.length());
        sb.append(val);
        System.out.println(sb.toString());
    }


}
