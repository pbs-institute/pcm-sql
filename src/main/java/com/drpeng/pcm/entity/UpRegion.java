package com.drpeng.pcm.entity;

/**
 * Created by huangxiaomao on 8/4/2016.
 */
public class UpRegion {
    private String regionId = "";

    private UpRegion() {

    }

    public UpRegion(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionId() {
        return regionId;
    }
}
