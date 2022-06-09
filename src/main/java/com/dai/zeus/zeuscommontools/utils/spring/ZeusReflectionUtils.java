package com.dai.zeus.zeuscommontools.utils.spring;

import org.junit.jupiter.api.Test;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ZeusReflectionUtils {

    /**
     * 反射相关操作
     */
    @Test
    public void test1() {
        //查看某个类以及所有父类（包含父类的父类）的所有属性
        ReflectionUtils.doWithFields(Zhangsan.class, new ReflectionUtils.FieldCallback() {
            @Override
            public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
                System.out.println(field.getName());
            }
        });
        //myProp
        //id
        //name

        //获取某个类以及所有父类（包含父类的父类）的所有方法
        ReflectionUtils.doWithMethods(Zhangsan.class, new ReflectionUtils.MethodCallback() {
            @Override
            public void doWith(Method method) throws IllegalArgumentException, IllegalAccessException {
                System.out.println(method.getDeclaringClass().getName() + "的" + method.getName());
            }
        });
        //lamda简便写法
        ReflectionUtils.doWithMethods(Zhangsan.class, method -> {
            System.out.println(method.getDeclaringClass().getName() + "的" + method.getName());
        });

        Zhangsan zhangSan = new Zhangsan();
        zhangSan.setName("张三");
        //获取某个属性的值
        ReflectionUtils.doWithFields(Zhangsan.class, field -> {
            field.setAccessible(true);
            Object object = ReflectionUtils.getField(field, zhangSan);
            System.out.println(object);
            //null
            //null
            //张三
        });
    }

}
