package com.dai.zeus.zeuscommontools.utils.apache.lang3;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.jupiter.api.Test;

public class ZuesObjectUtils {

    /**
     * str1,str2,str3...取第一个不为空的作为结果使用
     */
    @Test
    public void test1() {
        String str1 = null;
        String str2 = null;
        String str3 = "str233";
        System.out.println(ObjectUtils.firstNonNull(str1, str2, str3));
    }

    /**
     * System.identityHashCode(obj): 不管obj所在的类有没有重写hashcode方法，identityHashCode
     * 始终调用的都是Object.hashCode()
     */
    @Test
    public void test2() {
        System.out.println(ObjectUtils.identityToString("abc"));
    }
}
