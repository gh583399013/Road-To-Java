package com.ft.test003;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author mask
 * @date 2017/10/26 15:25
 * @desc
 */
public class Main {
    /**
     * 测试读取文件
     */
    public void testReadFiles() throws IOException {
        List<String> readLineList = FileUtils.readLines(new File("D:/input.txt"));
        for (String s : readLineList) {
            System.out.println(s);
        }
    }

    /**
     * 测试读取 ,写入文件
     */
    public void testReadAndWriteFiles() throws IOException {
        List<String> resultList = new ArrayList<>();
        resultList.add("111");
        resultList.add("222");
        resultList.add("aaa");
        FileUtils.writeLines(FileUtils.getFile("D:/output.txt"), "UTF-8",resultList,false);
    }
}
