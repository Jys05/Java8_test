package com.su.java8_test;

/**
 * Created by Sujiayong on 2018/2/6.
 */

public interface Defaulable2 {

    default  String notRequired(){
        return "Default implementation";
    }

}
