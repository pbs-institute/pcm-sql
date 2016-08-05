package com.drpeng.pcm.entity;

/**
 * Created by huangxiaomao on 8/3/2016.
 */
public class UpPlanProdRel extends UpItemRelat {

    public static final String OFFER_PLAN_INCLUDE_SRVC_SINGLE = "OFFER_PLAN_INCLUDE_SRVC_SINGLE";

    public UpPlanProdRel(UpProductItem relatProductItem) {
        super(relatProductItem);
        super.setTableName("product.up_plan_prod_rel");
    }
}
