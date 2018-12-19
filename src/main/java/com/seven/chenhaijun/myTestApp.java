package com.seven.chenhaijun;

import java.util.Optional;

/**
 * Created by ${chenhaijun} on 2018/12/1.
 */
public class myTestApp {

    public static void main(String args[]){
        TestPerson tp = null;
        System.out.println(Person.myHeight());
        Optional<TestPerson> t = Optional.ofNullable(tp);
        t.get().getName();
    }

}
