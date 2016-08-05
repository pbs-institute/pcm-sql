package com.drpeng.pcm.common;

/**
 * Created by huangxiaomao on 7/28/2016.
 */
public class IdGeneratorDefaultImpl implements IdGenerator {

    private long nextOfferId = 111100946668L;
    private long nextProductId = 121100900112L;
    private long nextServiceId = 100010000031L;
    private long nextPricePlanId = 131100900082L;
    private long nextItemRelatId = 20000100615L;
    private long nextItemRegionId = 2014110131L;
    private long nextItemCatalogId = 2014110111L;
    private long nextFeatureRelatId = 4973940L;

    private static IdGeneratorDefaultImpl uniqueInstance = new IdGeneratorDefaultImpl();

    private IdGeneratorDefaultImpl() {

    }

    public static IdGeneratorDefaultImpl getInstance() {
        return uniqueInstance;
    }

    public synchronized long getNextOfferId() {
        nextOfferId ++;
        return nextOfferId;
    }

    public synchronized long getNextProductId() {
        nextProductId ++;
        return nextProductId;
    }

    public synchronized long getNextServiceId() {
        nextServiceId ++;
        return nextServiceId;
    }

    public synchronized long getNextPricePlanId() {
        nextPricePlanId ++;
        return nextPricePlanId;
    }

    public synchronized long getNextItemRelatId() {
        nextItemRelatId ++;
        return nextItemRelatId;
    }

    public synchronized long getNextItemRegionId() {
        nextItemRegionId ++;
        return nextItemRegionId;
    }

    public synchronized long getNextItemCatalogId() {
        nextItemCatalogId ++;
        return nextItemCatalogId;
    }

    public synchronized long getNextFeatureRelatId() {
        nextFeatureRelatId ++;
        return nextFeatureRelatId;
    }

}
