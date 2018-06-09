package com.qycDo.app.wow.test.beanTest;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

public class BeanTransTest {
    
    public static void main(String[] args) {
        
        List<String> needTransParam = new ArrayList<>();
        needTransParam.add("pv");
        needTransParam.add("rate");
        needTransParam.add("uv");
        needTransParam.add("name");
        needTransParam.add("amount");
        needTransParam.add("pvTest");
        
        BeanA beanA = new  BeanA();
        beanA.setPv(11L);
        beanA.setUv(202);
        beanA.setName("name");
        beanA.setRate(22.22);
        beanA.setAmount(new BigDecimal(333.33));
        beanA.setPvTest(222L);
        
        BeanB beanB = new BeanB();
        
        try {
//            BeanUtils.copyProperties(beanA, beanB);
            
            for (String str : needTransParam) {
               try {
//                   String[] strarr = BeanUtils.getArrayProperty(beanA, str);
//                   System.out.println(BeanUtils.getProperty(beanA, str).getClass());
                   System.out.println(BeanUtils.getProperty(beanA, str));
//                System.out.println(str + "||"+BeanUtils.getArrayProperty(beanA, str)[0]);
//                System.out.println(BeanUtils.getProperty(beanA, "pvTest"));
//                   Field[] fields = BeanB.class.getDeclaredField(str)
                   System.out.println(     beanA.getClass().getDeclaredField(str).getType());
                   
                   String value = BeanUtils.getProperty(beanA, str);
                   if ("java.math.BigDecimal".equals(beanA.getClass().getDeclaredField(str).getType())) {
                       value = BeanUtils.getProperty(beanA, str);
                   }else{
                       
                   }
                   BeanUtils.copyProperty(beanB, str, BeanUtils.getProperty(beanA, str));
            } catch (NoSuchMethodException | NoSuchFieldException | SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
            }
          
            
  
            System.out.println("chakan");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        
    }

}
