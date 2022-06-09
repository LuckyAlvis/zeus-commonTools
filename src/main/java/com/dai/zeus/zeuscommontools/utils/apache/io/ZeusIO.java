package com.dai.zeus.zeuscommontools.utils.apache.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ZeusIO {

    /**
     * 读取指定的文本文件的内容为字符串
     */
    @Test
    public void test1() throws IOException {
        String path = "D:\\Projects\\JavaProjects\\zeus-commonTools\\src\\main\\resources\\1.txt";
        System.out.println(FileUtils.readFileToString(new File(path), StandardCharsets.UTF_8));
    }

    /**
     * 按行读取指定的文本文件的内容为字符串List
     */
    @Test
    public void test2() throws IOException {
        String path = "D:\\Projects\\JavaProjects\\zeus-commonTools\\src\\main\\resources\\1.txt";
        List<String> strings = FileUtils.readLines(new File(path), StandardCharsets.UTF_8);
        strings.forEach(System.out::println);
    }

    /**
     * 获取文件的后缀
     * 获取文件的baseName
     */
    @Test
    public void test3() throws IOException {
        String path = "D:\\Projects\\JavaProjects\\zeus-commonTools\\src\\main\\resources\\1.txt";
        System.out.println(FilenameUtils.getBaseName(path));
        System.out.println(FilenameUtils.getExtension(path));
    }
}
