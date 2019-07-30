package com.alex.mapstructplayground.entity;

import java.util.List;

public class BillingGroup {
    private String id;
    private BillingCategory category;
    private String name;
    private List<BillingItem> billingItemList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BillingCategory getCategory() {
        return category;
    }

    public void setCategory(BillingCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BillingItem> getBillingItemList() {
        return billingItemList;
    }

    public void setBillingItemList(List<BillingItem> billingItemList) {
        this.billingItemList = billingItemList;
    }
}