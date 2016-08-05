package com.drpeng.pcm.entity;

/**
 * Created by huangxiaomao on 8/3/2016.
 */
public class UpBusiness extends UpProductItem {

    private UpBusiness() {
        super(UpProductItem.ITEM_TYPE_BUSINESS_OPERATION);
    }

    public UpBusiness(String businessId) {
        super(businessId, UpProductItem.ITEM_TYPE_BUSINESS_OPERATION);
    }
}
