package com.su.java8_test;

/**
 * Created by Sujiayong on 2018/2/6.
 */

public interface Defaulable extends Defaulable2{
    @Override
    default String notRequired() {
        return "sgdjhasgjh";
    }

    //    default  String notRequired(){
//        return "Default implementation";
//    }
//
//    static String getZoneId () {
//        return "ahahah";
//    }
}
