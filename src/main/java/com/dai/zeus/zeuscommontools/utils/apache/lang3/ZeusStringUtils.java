package com.dai.zeus.zeuscommontools.utils.apache.lang3;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class ZeusStringUtils {

    /**
     * 判断null或""或"   "
     */
    @Test
    public void test1() {
        String str = "   ";
        System.out.println(StringUtils.isBlank(str));
        System.out.println(StringUtils.isNotBlank(str));
    }

    /**
     * 判断null或""
     */
    @Test
    public void test2() {
        String str = "   ";
        System.out.println(StringUtils.isBlank(str));   //true
        System.out.println(StringUtils.isNotBlank(str));//false
        System.out.println(StringUtils.isEmpty(str));   //false
        System.out.println(StringUtils.isNotEmpty(str));//true
    }

    /**
     * 脱敏
     */
    @Test
    public void test3() {
        String str = "13088889999";
        String left = StringUtils.left(str, 3);
        String right = StringUtils.right(str, 4);
        System.out.println(left + "****" + right); //130****9999
    }

    /**
     * 用于将字符串填充到指定长度
     */
    @Test
    public void test4() {
        String str = "13088889999";
        String strLeftPad = StringUtils.rightPad(StringUtils.left(str, 3), 7, '*');//130***
        System.out.println(strLeftPad + StringUtils.right(str, 4)); //130****9999
    }

}
