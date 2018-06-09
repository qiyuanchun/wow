package com.qycDo.app.wow.test.beanTest;

import java.io.Serializable;
import java.math.BigDecimal;

public class BeanA implements Serializable{

    private static final long serialVersionUID = 1728508177020478854L;
    
    private Long pv;
    
    private Double rate;
    
    private Integer uv;
    
    private String name;
    
    private BigDecimal amount;
    
    private Long pvTest;
    

    public Long getPvTest() {
        return pvTest;
    }

    public void setPvTest(Long pvTest) {
        this.pvTest = pvTest;
    }

    public Long getPv() {
        return pv;
    }

    public void setPv(Long pv) {
        this.pv = pv;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
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
