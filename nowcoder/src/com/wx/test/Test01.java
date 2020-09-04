package com.wx.test;

public class Test01 {
    public static void main(String[] args) {
        Runnable r = new TicketRunnableImpl();
        Thread t1 = new Thread(r, "窗口一");
        Thread t2 = new Thread(r, "窗口二");
        Thread t3 = new Thread(r, "窗口三");
        Thread t4 = new Thread(r, "窗口四");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
