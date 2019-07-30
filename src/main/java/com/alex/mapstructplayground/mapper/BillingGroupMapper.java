package com.alex.mapstructplayground.mapper;

import com.alex.mapstructplayground.dto.BillingGroupDTO;
import com.alex.mapstructplayground.dto.BillingItemDTO;
import com.alex.mapstructplayground.entity.BillingGroup;
import com.alex.mapstructplayground.entity.BillingItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BillingGroupMapper {
    BillingGroupMapper INSTANCE = Mappers.getMapper(BillingGroupMapper.class);

    @Mapping(target = "billingGroupId", source = "id")
    @Mapping(target = "billingGroupName", source = "name")
    @Mapping(target = "billingCategoryId", source = "category.id")
    @Mapping(target = "billingItemDTOList", source = "billingItemList")
    @Mapping(target = "billingCategoryAccountCode", source = "category.accountCode")
    @Mapping(target = "billingCategoryDescription", source = "category.description")
    BillingGroupDTO map(BillingGroup source);

    @Mapping(target = "billingItemName", source = "name")
    @Mapping(target = "billingItemStandardPrice", source = "standardPrice")
    BillingItemDTO map(BillingItem source);
}