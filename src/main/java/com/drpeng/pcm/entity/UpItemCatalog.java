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

    private void setRelatId(String relatId) {
        this.relatId = relatId;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getProductItemId() {
        return productItemId;
    }

    public void setProductItemId(String productItemId) {
        this.productItemId = productItemId;
    }

    public String getProdItemRelatKindId() {
        if (prodItemRelatKindId.equals("null")) {
            return prodItemRelatKindId;
        }
        return "'" + prodItemRelatKindId + "'";
    }

    public void setProdItemRelatKindId(String prodItemRelatKindId) {
        this.prodItemRelatKindId = prodItemRelatKindId;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getDelFlag() {
        if (delFlag.equals("null")) {
            return delFlag;
        }
        return "'" + delFlag + "'";
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
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
