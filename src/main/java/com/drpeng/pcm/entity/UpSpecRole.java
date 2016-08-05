package com.drpeng.pcm.entity;

/**
 * Created by huangxiaomao on 8/3/2016.
 */
public class UpSpecRole extends UpProductItem {

    private UpSpecRole() {
        super(UpProductItem.ITEM_TYPE_SPEC_ROLE);
    }

    public UpSpecRole(String productSpecId) {
        super(productSpecId, UpProductItem.ITEM_TYPE_SPEC_ROLE);
    }
}
