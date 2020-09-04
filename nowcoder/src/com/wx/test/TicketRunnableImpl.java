package com.wx.test;

public class TicketRunnableImpl implements Runnable{
    private int ticketNum = 1000;
    @Override
    public void run() {
        while (ticketNum>0){
            synchronized (this){
                if (ticketNum>0){
                    ticketNum--;
                    System.out.println(Thread.currentThread().getName()+"售出一张票，剩余："+ticketNum);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
