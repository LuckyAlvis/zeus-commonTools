package com.dai.zeus.zeuscommontools.utils.apache.lang3;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Test;

public class ZeusNumberUtils {

    /**
     * 判断传入的字符串是否为数字
     */
    @Test
    public void test5() {
        String str = "13088889999";
        // isDigits只能判断是否为整数
        System.out.println(NumberUtils.isDigits(str));
        // isParsable可以判断是否为整数、浮点数，不能识别正负号
        System.out.println(NumberUtils.isParsable(str));
        // isCreatable可以判断是否为整数、浮点数、识别正负号、以及进制
        System.out.println(NumberUtils.isCreatable(str));
    }
}
