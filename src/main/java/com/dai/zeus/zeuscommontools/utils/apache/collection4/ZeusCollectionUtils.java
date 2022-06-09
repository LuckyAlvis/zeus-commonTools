package com.dai.zeus.zeuscommontools.utils.apache.collection4;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ZeusCollectionUtils {

    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        System.out.println(CollectionUtils.isEmpty(list));
        System.out.println(CollectionUtils.isNotEmpty(list));
    }

    @Test
    public void test2() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("c");
        // 取交集
        System.out.println(CollectionUtils.intersection(list1, list2));//[c]
        // 取并集
        System.out.println(CollectionUtils.union(list1, list2));//[a, 1, b, 2, c]
        // 取差集 list1-list2
        System.out.println(CollectionUtils.subtract(list1, list2));//[a, b]
        // 取差集 list2-list1
        System.out.println(CollectionUtils.subtract(list2, list1));//[1, 2]
    }
}
