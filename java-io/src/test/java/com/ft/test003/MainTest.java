package com.ft.test003;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mask
 * @date 2017/10/26 15:51
 * @desc
 */
public class MainTest {
    private Main service = null;

    @Before
    public  void init(){
        service = new Main();
    }

    @Test
    public void testReadFiles() throws Exception {
        service.testReadFiles();
    }

    @Test
    public void testReadAndWriteFiles() throws Exception {
        service.testReadAndWriteFiles();
    }

}