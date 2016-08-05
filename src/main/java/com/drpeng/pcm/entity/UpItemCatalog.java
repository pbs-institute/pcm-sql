package com.drpeng.pcm.entity;

/**
 * Created by huangxiaomao on 8/4/2016.
 */
public class UpItemCatalog extends BaseEntity {

    private String relatId = "null";
    private String catalogId = "null";
    private String productItemId = "null";
    private String prodItemRelatKindId = "OFFER_PLAN";
    private String creater = "10458";
    private String createDate = "sysdate";
    private String modifier = "null";
    private String modifyDate = "null";
    private String delFlag = "1";

    private UpProdItemCatalog upProdItemCatalog = null;

    private UpItemCatalog() {

    }

    public UpItemCatalog(UpProdItemCatalog upProdItemCatalog) {
        this.upProdItemCatalog = upProdItemCatalog;
        relatId = String.valueOf(getNextItemCatalogId());
        catalogId = this.upProdItemCatalog.getCatalogId();
    }

    public String getRelatId() {
        return relatId;
    }

    private UpItemCatalog setRelatId(String relatId) {
        this.relatId = relatId;
        return this;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public UpItemCatalog setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getProductItemId() {
        return productItemId;
    }

    public UpItemCatalog setProductItemId(String productItemId) {
        this.productItemId = productItemId;
        return this;
    }

    public String getProdItemRelatKindId() {
        if (prodItemRelatKindId.equals("null")) {
            return prodItemRelatKindId;
        }
        return "'" + prodItemRelatKindId + "'";
    }

    public UpItemCatalog setProdItemRelatKindId(String prodItemRelatKindId) {
        this.prodItemRelatKindId = prodItemRelatKindId;
        return this;
    }

    public String getCreater() {
        return creater;
    }

    public UpItemCatalog setCreater(String creater) {
        this.creater = creater;
        return this;
    }

    public String getCreateDate() {
        return createDate;
    }

    public UpItemCatalog setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    public String getModifier() {
        return modifier;
    }

    public UpItemCatalog setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public UpItemCatalog setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
        return this;
    }

    public String getDelFlag() {
        if (delFlag.equals("null")) {
            return delFlag;
        }
        return "'" + delFlag + "'";
    }

    public UpItemCatalog setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public String toInsertSql() {
        StringBuffer sqlBuf = new StringBuffer();

        sqlBuf.append("insert into product.up_item_catalog\n" +
                "  (relat_id,\n" +
                "   catalog_id,\n" +
                "   product_item_id,\n" +
                "   prod_item_relat_kind_id,\n" +
                "   creater,\n" +
                "   create_date,\n" +
                "   modifier,\n" +
                "   modify_date,\n" +
                "   del_flag\n" +
                "  )\n" +
                "values (\n")
                .append("   " + getRelatId() + ",\n")
                .append("   " + getCatalogId() + ",\n")
                .append("   " + getProductItemId() + ",\n")
                .append("   " + getProdItemRelatKindId() + ",\n")
                .append("   " + getCreater() + ",\n")
                .append("   " + getCreateDate() + ",\n")
                .append("   " + getModifier() + ",\n")
                .append("   " + getModifyDate() + ",\n")
                .append("   " + getDelFlag() + "\n")
                .append(");\n\n")
        ;

        return sqlBuf.toString();
    }
}
