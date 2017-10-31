package com.ft.test001;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * !!!!!!!!!!!junit 不能测试多线程 又被坑了一次
 * @author mask
 * @date 2017/10/31 15:28
 * @desc
 */
public class VolatileMainTest {
    @Test
    public void testVolatileCount() throws Exception {
        VolatileMain service = new VolatileMain();
        service.testVolatileCount();
    }

    @Test
    public void testSimpleCount() throws Exception {
        VolatileMain service = new VolatileMain();
        service.testSimpleCount();
    }

}