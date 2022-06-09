package com.dai.zeus.zeuscommontools.utils.apache.collection4;

import org.apache.commons.collections4.MapUtils;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class ZeusMapUtils {
    @Test
    public void test1() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "123");
        System.out.println(MapUtils.isEmpty(map));
        System.out.println(MapUtils.isNotEmpty(map));
        // 获取map中key=a的value并转为Integer
        System.out.println(MapUtils.getInteger(map, "a"));
    }
    @Test
    public void test2() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "123");
        // 获取map中key=a的value并转为Integer
        System.out.println(MapUtils.getInteger(map, "a"));
    }

}
