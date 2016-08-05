package com.drpeng.pcm.common;

/**
 * Created by huangxiaomao on 7/28/2016.
 */
public interface IdGenerator {

    long getNextOfferId();

    long getNextProductId();

    long getNextServiceId();

    long getNextPricePlanId();

    long getNextItemRelatId();

    long getNextItemRegionId();

    long getNextItemCatalogId();

    long getNextFeatureRelatId();

}
