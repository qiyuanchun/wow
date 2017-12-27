package com.qycDo.app.wow.test.staticTest;

import com.qycDo.app.util.BeanUtil;

public class StaticTest {


    static{
        System.out.println("静态代码块在类加载的时候会执行，一次 ");
    }


    public static void main(String[] args) {
        System.out.println("静态代码块已经加载");
        try {
           Class beanUtil =  Class.forName("com.qycDo.app.util.BeanUtil");
           boolean isBeanUtil = beanUtil.isInstance(new BeanUtil());
           System.out.println(isBeanUtil);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
