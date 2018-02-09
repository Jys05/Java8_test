package com.su.java8_test.defaultMethods;

/**
 * Created by Sujiayong on 2018/2/6.
 * 默认方法（Default Methods）
 */

public interface MyInterfaceParent {

    default String getIntrodution() {
        return "这是父接口";
    }

}
