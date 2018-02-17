package com.su.java8_test.FunctionInterFace;

/**
 * Created by Mr.Su on 2018/2/16.
 * FunctionInterface注解的测试
 */

public interface FunctionInterfaceTest2 extends FunctionInterfaceTest{

    default void method(String value){

    }


    public abstract void sayHello();
}
