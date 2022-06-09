package com.dai.zeus.zeuscommontools.utils.spring;

import org.junit.jupiter.api.Test;
import org.springframework.util.ClassUtils;

public class ZeusClassUtils {

    /**
     * 判断当前应用是否加载了com.roadjava.zhao这样一个类
     * 应用场景：当某个类存在后，则做什么事情
     */
    @Test
    public void test1() {
        String className = "com.roadjava.zhao";
//        try {
//            Class.forName(className);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        System.out.println(ClassUtils.isPresent(className, null));
    }

}
