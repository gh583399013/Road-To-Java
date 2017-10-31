package com.ft.test001;

/**
 * @author mask
 * @date 2017/10/31 15:11
 * @desc
 */
public class VolatileMain {
    private volatile NumberCounter volatileVar;
    private NumberCounter simpleVar;

    public NumberCounter getVolatileVar() {
        return volatileVar;
    }

    public void setVolatileVar(NumberCounter volatileVar) {
        this.volatileVar = volatileVar;
    }

    public NumberCounter getSimpleVar() {
        return simpleVar;
    }

    public void setSimpleVar(NumberCounter simpleVar) {
        this.simpleVar = simpleVar;
    }

    /**
     * 测试volatile的自增
     */
    public void testVolatileCount(){
        volatileVar = new NumberCounter();
        CountThread countThread = new CountThread(volatileVar);
        Thread thread1 = new Thread(countThread,"线程1");
        Thread thread2 = new Thread(countThread,"线程2");
        Thread thread3 = new Thread(countThread,"线程3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

    /**
     * 测试非volatile的自增
     */
    public void testSimpleCount(){
        simpleVar = new NumberCounter();
        CountThread countThread = new CountThread(simpleVar);
        Thread thread1 = new Thread(countThread,"线程1");
        Thread thread2 = new Thread(countThread,"线程2");
        Thread thread3 = new Thread(countThread,"线程3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static void main(String[] args) {
        VolatileMain service = new VolatileMain();
        //经测试不会出现相同的值
        service.testVolatileCount();

        //经测试会拿到一样的值 比如同时拿到22 然后都打印23
//        service.testSimpleCount();
    }
}
