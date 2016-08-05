package com.drpeng.pcm.entity;
import com.drpeng.pcm.common.ProviderLoader;

/**
 * Created by huangxiaomao on 7/28/2016.
 */
public class BaseEntity {

    protected long getNextOfferId() {
        return ProviderLoader.getIdGeneratorInstance().getNextOfferId();
    }

    protected long getNextProductId() {
        return ProviderLoader.getIdGeneratorInstance().getNextProductId();
    }

    protected long getNextServiceId() {
        return ProviderLoader.getIdGeneratorInstance().getNextServiceId();
    }

    protected long getNextPricePlanId() {
        return ProviderLoader.getIdGeneratorInstance().getNextPricePlanId();
    }

    protected long getNextItemRelatId() {
        return ProviderLoader.getIdGeneratorInstance().getNextItemRelatId();
    }

    protected long getNextItemRegionId() {
        return ProviderLoader.getIdGeneratorInstance().getNextItemRegionId();
    }

    protected long getNextItemCatalogId() {
        return ProviderLoader.getIdGeneratorInstance().getNextItemCatalogId();
    }

    protected long getNextFeatureRelatId() {
        return ProviderLoader.getIdGeneratorInstance().getNextFeatureRelatId();
    }
}
