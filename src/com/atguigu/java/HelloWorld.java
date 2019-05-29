package com.atguigu.java;


import java.util.ArrayList;

/*

 */
public class HelloWorld {


    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println("hello world!");
        list.add(0,123);
        System.out.println(list.get(0));
//        method();

    }
    public static void method(){
        System.out.println("使用idea第一天！");

    }

}
