package com.alex.mapstructplayground.entity;

import java.math.BigDecimal;

public class BillingItem {
    private String name;
    private BigDecimal standardPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(BigDecimal standardPrice) {
        this.standardPrice = standardPrice;
    }
}