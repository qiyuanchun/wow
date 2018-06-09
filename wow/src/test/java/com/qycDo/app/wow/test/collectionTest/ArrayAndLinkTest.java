package com.qycDo.app.wow.test.collectionTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import aj.org.objectweb.asm.Type;

public class ArrayAndLinkTest {

    
    /**
     * 
     * @title TODO(方法功能)
     * @author qiyuanchun 
     * @date 2018年3月25日 上午10:27:52
     * @useScene TODO(方法使用场景)
     * @parameterExample 
     * @returnExample 
     * @param args void
     * @url
     */
    public static void main(String[] args) {
//        length 10000000时 ARR遍历耗时5169 LIN遍历耗时3458
//        length 1000000时 ARR遍历耗时142 LIN遍历耗时197
//        length 100000时 ARR遍历耗时29 LIN遍历耗时23
//        length 100000时 ARR遍历耗时11 LIN遍历耗时7
// 数据量不大时（小于10W），LINKLIST必ARR 快
        Integer length = 10000;
        
        Long startTime  = System.currentTimeMillis();
        List<String> list ;
        list = getArrayList(length, arrType);
        for (String string : list) {
        }
        System.out.println(arrType +"end");
        Long endTime  = System.currentTimeMillis();
        System.out.println(arrType +"遍历耗时" + (endTime - startTime));
        
        startTime = System.currentTimeMillis();
        list = getArrayList(length, linkType);
        for (String string : list) {
        }
        System.out.println(linkType +"end");
        endTime  = System.currentTimeMillis();
        System.out.println(linkType +"遍历耗时" + (endTime - startTime));
    }
    
    private static final String arrType = "ARR";
    private static final String linkType = "LIN";
   
    
    private static List<String> getArrayList(Integer length,String type){
        List<String> list;
        if (linkType.equals(type)) {
            list =  new LinkedList<>();
        }else{
            list = new ArrayList<>();
        }
        
        for (int i = 0; i < length; i++) {
            list.add(String.valueOf(i));
        }
        return list;
        
        
    }
}
