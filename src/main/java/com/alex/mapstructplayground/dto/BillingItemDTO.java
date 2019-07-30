package com.alex.mapstructplayground.dto;

import java.math.BigDecimal;

public class BillingItemDTO {
    private String billingItemName;
    private BigDecimal billingItemStandardPrice;

    public String getBillingItemName() {
        return billingItemName;
    }

    public void setBillingItemName(String billingItemName) {
        this.billingItemName = billingItemName;
    }

    public BigDecimal getBillingItemStandardPrice() {
        return billingItemStandardPrice;
    }

    public void setBillingItemStandardPrice(BigDecimal billingItemStandardPrice) {
        this.billingItemStandardPrice = billingItemStandardPrice;
    }
}