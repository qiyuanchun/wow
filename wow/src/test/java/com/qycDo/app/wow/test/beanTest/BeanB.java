package com.qycDo.app.wow.test.beanTest;

import java.io.Serializable;
import java.math.BigDecimal;

public class BeanB implements Serializable{

    
    private static final long serialVersionUID = 1247689939455296225L;

    private String pv;
    
    private String rate;
    
    private String uv;
    
    private String name;
    
    private BigDecimal amount;
    
    private Long pvTest;
    
    

    public Long getPvTest() {
        return pvTest;
    }

    public void setPvTest(Long pvTest) {
        this.pvTest = pvTest;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }


    

}
