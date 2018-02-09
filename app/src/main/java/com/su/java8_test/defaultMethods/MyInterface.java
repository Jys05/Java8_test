package com.su.java8_test.defaultMethods;

/**
 * Created by Sujiayong on 2018/2/6.
 * 默认方法（Default Methods）
 */

public interface MyInterface extends MyInterfaceParent {

    @Override
    default String getIntrodution() {
        return "这是继承了InterfaceParent父接口";
    }

    default String getDelautMethod() {
        return "这是默认方法";
    }

    static String getStaticMethod() {
        return "这是静态方法块";
    }
}
