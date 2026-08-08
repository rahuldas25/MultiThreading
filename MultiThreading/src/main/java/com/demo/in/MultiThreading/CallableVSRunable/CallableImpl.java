package com.demo.in.MultiThreading.CallableVSRunable;

import java.util.concurrent.*;

public class CallableImpl implements Callable<Integer> {
    public Integer call(){
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args)throws Exception {
        CallableImpl callable = new CallableImpl();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread th=new Thread(futureTask);
        th.start();
         //Get result

        int result=futureTask.get();
        System.out.println(result);
    }


}
