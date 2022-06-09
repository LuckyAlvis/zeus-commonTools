package com.dai.zeus.zeuscommontools.utils.apache.lang3;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Test;

public class ZeusArrayUtils {

    /**
     * 判断一个数组是不是空的(null或长度为0)
     */
    @Test
    public void test1() {
        Integer[] ints = new Integer[1];
        System.out.println(ArrayUtils.isEmpty(ints));//false
        ints = new Integer[0];
        System.out.println(ArrayUtils.isEmpty(ints));//true
    }

    /**
     * 给已有数组添加元素
     */
    @Test
    public void test2() {
        int[] ints = new int[5];
        System.out.println(ArrayUtils.toString(ints));//{0,0,0,0,0}

        int[] newArr = ArrayUtils.add(ints, 7);
        System.out.println(ArrayUtils.toString(ints));//{0,0,0,0,0}
        // add方法会拷贝一个数组
        System.out.println(ArrayUtils.toString(newArr));//{0,0,0,0,0,7}
    }
}
