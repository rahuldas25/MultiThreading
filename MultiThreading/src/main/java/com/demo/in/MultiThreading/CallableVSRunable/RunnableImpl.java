package com.demo.in.MultiThreading.CallableVSRunable;

public class RunnableImpl implements Runnable{
    public void run(){
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {

        Thread t1 = new Thread(new RunnableImpl());
        t1.start();
    }
}
