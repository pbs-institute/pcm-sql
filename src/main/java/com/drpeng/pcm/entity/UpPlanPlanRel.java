package com.drpeng.pcm.entity;

/**
 * Created by huangxiaomao on 8/3/2016.
 */
public class UpPlanPlanRel extends UpItemRelat {

    public static final String CANCEL_A_JOIN_CANCEL_B = "CANCEL_A_JOIN_CANCEL_B";
    public static final String OFFER_PLAN_CHANGE_OFFER_PLAN = "OFFER_PLAN_CHANGE_OFFER_PLAN";
    public static final String OFFER_PLAN_FRIEND_OFFER_PLAN = "OFFER_PLAN_FRIEND_OFFER_PLAN";
    public static final String OFFER_PLAN_INCLUDE_OFFER_PLAN = "OFFER_PLAN_INCLUDE_OFFER_PLAN";
    public static final String OFFER_PLAN_MUTEX_OFFER_PLAN = "OFFER_PLAN_MUTEX_OFFER_PLAN";
    public static final String OFFER_PLAN_MUTEX_OFFER_PLAN_AND_MUST_SELECT_ONE = "OFFER_PLAN_MUTEX_OFFER_PLAN_AND_MUST_SELECT_ONE";

    public UpPlanPlanRel(UpProductItem relatProductItem) {
        super(relatProductItem);
        super.setTableName("product.up_plan_plan_rel");
    }
}
