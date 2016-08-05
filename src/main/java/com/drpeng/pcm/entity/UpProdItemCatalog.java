package com.drpeng.pcm.entity;

/**
 * Created by huangxiaomao on 8/4/2016.
 */
public class UpProdItemCatalog {
    private String catalogId = "";

    private UpProdItemCatalog() {

    }

    public UpProdItemCatalog(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogId() {
        return catalogId;
    }
}
