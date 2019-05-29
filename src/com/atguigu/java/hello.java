package com.atguigu.java;

import java.util.ArrayList;

public class hello {
    /*
    模板一：
    psvm

    相当于eclipse 中的 main
     */

    //prsv
    private static final  int PRICE  =5;
    //psvm
    public static void main(String[] args) {


        //list.for
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }

    }
    public void method(){
        //sout
        System.out.println();
        //soutp
       // System.out.println("args = [" + args + "]");
        //iter


    }
}
