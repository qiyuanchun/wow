package com.qycDo.app.wow.test.bloomTest;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

public class BloomTest {



    private static int size =1000000;

    private static BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(),size);

    public static void main(String[] args) {
        for (int i = 0; i < size; i++) {
            bloomFilter.put(i);
        }

        long startTime = System.nanoTime();
        System.out.println(startTime);
        /**判断100万数据中是否存在73897**/
        if(bloomFilter.mightContain(73897)){
            System.out.println("命中");
        }

        long endTime = System.nanoTime();
        System.out.println(endTime);
        System.out.println("程序运行时间："+ (endTime - startTime) + "纳秒");

    }
}
