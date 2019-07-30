package com.alex.mapstructplayground.dto;

import java.util.List;

public class BillingGroupDTO {
    private String billingCategoryId;
    private String billingCategoryAccountCode;
    private String billingCategoryDescription;

    private String billingGroupId;
    private String billingGroupName;

    private List<BillingItemDTO> billingItemDTOList;

    public String getBillingCategoryId() {
        return billingCategoryId;
    }

    public void setBillingCategoryId(String billingCategoryId) {
        this.billingCategoryId = billingCategoryId;
    }

    public String getBillingCategoryAccountCode() {
        return billingCategoryAccountCode;
    }

    public void setBillingCategoryAccountCode(String billingCategoryAccountCode) {
        this.billingCategoryAccountCode = billingCategoryAccountCode;
    }

    public String getBillingCategoryDescription() {
        return billingCategoryDescription;
    }

    public void setBillingCategoryDescription(String billingCategoryDescription) {
        this.billingCategoryDescription = billingCategoryDescription;
    }

    public String getBillingGroupId() {
        return billingGroupId;
    }

    public void setBillingGroupId(String billingGroupId) {
        this.billingGroupId = billingGroupId;
    }

    public String getBillingGroupName() {
        return billingGroupName;
    }

    public void setBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
    }

    public List<BillingItemDTO> getBillingItemDTOList() {
        return billingItemDTOList;
    }

    public void setBillingItemDTOList(List<BillingItemDTO> billingItemDTOList) {
        this.billingItemDTOList = billingItemDTOList;
    }
}