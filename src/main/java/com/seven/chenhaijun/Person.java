package com.seven.chenhaijun;

/**
 * Created by ${chenhaijun} on 2018/12/1.
 */
public interface Person {
    default String getName(){
        return "人";
    };
    static  String myHeight(){
        return "1.2";
    }
}
