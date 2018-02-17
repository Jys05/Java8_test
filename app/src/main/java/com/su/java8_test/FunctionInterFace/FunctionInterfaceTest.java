package com.su.java8_test.FunctionInterFace;

/**
 * Created by Mr.Su on 2018/2/16.
 * FunctionInterface注解的测试
 * :将自定义接口，使用Lambda表达式规范（只有一个方法）
 */

@FunctionalInterface
public interface FunctionInterfaceTest {

    default void method(String value){

    }


    public abstract void sayHello();
}
