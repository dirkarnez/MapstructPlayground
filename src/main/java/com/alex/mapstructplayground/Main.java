package com.alex.mapstructplayground;

import com.alex.mapstructplayground.dto.BillingGroupDTO;
import com.alex.mapstructplayground.entity.BillingCategory;
import com.alex.mapstructplayground.entity.BillingGroup;
import com.alex.mapstructplayground.entity.BillingItem;
import com.alex.mapstructplayground.mapper.BillingGroupMapper;
import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        entitiesToDto();
    }

    public static void dto2Entities() {

    }

    public static void entitiesToDto() {
        BillingCategory billingCategory = new BillingCategory();
        billingCategory.setId("8341C9C4BBDDCC4DE05011AC0200007C");
        billingCategory.setAccountCode("PROC001");
        billingCategory.setDescription("Procedure");

        BillingGroup billingGroup = new BillingGroup();
        billingGroup.setId("8341C9C4BBDDCC4DE050E1AC0200009D");
        billingGroup.setCategory(billingCategory);
        billingGroup.setName("Doctor Procedure");

        List<BillingItem> billingItemList = new ArrayList<>();
        {
            BillingItem item = new BillingItem();
            item.setName("billing_item_1");
            item.setStandardPrice(new BigDecimal(100));
            billingItemList.add(item);
        }
        {
            BillingItem item = new BillingItem();
            item.setName("billing_item_2");
            item.setStandardPrice(new BigDecimal(200));
            billingItemList.add(item);
        }
        billingGroup.setBillingItemList(billingItemList);
        System.out.println(new Gson().toJson(BillingGroupMapper.INSTANCE.map(billingGroup)));
    }
}