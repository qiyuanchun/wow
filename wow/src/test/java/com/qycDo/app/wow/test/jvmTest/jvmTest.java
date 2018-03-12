package com.qycDo.app.wow.test.jvmTest;

/**
 * Created by qiyuanchun on 18/1/21.
 */
public class jvmTest {

    public static void main(String[] args) {

        print2RadixTest();
    }
    /**
     *使用位运算查看整数中每一位的实际值
     */
    public static void print2RadixTest(){

        int a = -10;
        //32是因为INT有32位
        for (int i = 0; i < 32; i++) {
            int t = (a & 0x80000000 >>> i ) >>>(31 - i);
            System.out.print(t);
        }
    }
}
