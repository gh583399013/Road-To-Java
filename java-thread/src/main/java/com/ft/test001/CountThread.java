package com.ft.test001;

/**
 * @author mask
 * @date 2017/10/31 15:18
 * @desc
 */
public class CountThread implements Runnable{

    private NumberCounter numberCounter;

    public CountThread(NumberCounter numberCounter) {
        this.numberCounter = numberCounter;
    }

    @Override
    public void run() {
        while (true){
            if(numberCounter.getNumber() >= 100){
                return ;
            }
            numberCounter.setNumber(numberCounter.getNumber() + 1);
            System.out.println(Thread.currentThread().getName() + "---" + numberCounter.getNumber());
            try {
                //休眠增加并发几率
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
