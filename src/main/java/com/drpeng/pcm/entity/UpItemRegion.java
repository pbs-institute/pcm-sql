package com.drpeng.pcm.entity;

/**
 * Created by huangxiaomao on 8/4/2016.
 */
public class UpItemRegion extends BaseEntity {

    private String itemRegionId = "null";
    private String productItemId = "null";
    private String regionId = "null";
    private String relatRegionType = "REGION";
    private String itemType = "OFFER_PLAN";
    private String effDate = "sysdate";
    private String expDate = "to_date('20991231235959', 'yyyymmddhh24miss')";
    private String creater = "10458";
    private String createDate = "sysdate";
    private String modifier = "null";
    private String modifyDate = "null";
    private String delFlag = "1";

    private UpRegion upRegion = null;

    private UpItemRegion() {

    }

    public UpItemRegion(UpRegion upRegion) {
        this.upRegion = upRegion;
        itemRegionId = String.valueOf(getNextItemRegionId());
        regionId = this.upRegion.getRegionId();
    }

    public String getItemRegionId() {
        return itemRegionId;
    }

    private UpItemRegion setItemRegionId(String itemRegionId) {
        this.itemRegionId = itemRegionId;
        return this;
    }

    public String getProductItemId() {
        return productItemId;
    }

    public UpItemRegion setProductItemId(String productItemId) {
        this.productItemId = productItemId;
        return this;
    }

    public String getRegionId() {
        if (regionId.equals("null")) {
            return regionId;
        }
        return "'" + regionId + "'";
    }

    public UpItemRegion setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    public String getRelatRegionType() {
        if (relatRegionType.equals("null")) {
            return relatRegionType;
        }
        return "'" + relatRegionType + "'";
    }

    public UpItemRegion setRelatRegionType(String relatRegionType) {
        this.relatRegionType = relatRegionType;
        return this;
    }

    public String getItemType() {
        if (itemType.equals("null")) {
            return itemType;
        }
        return "'" + itemType + "'";
    }

    public UpItemRegion setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    public String getEffDate() {
        return effDate;
    }

    public UpItemRegion setEffDate(String effDate) {
        this.effDate = effDate;
        return this;
    }

    public String getExpDate() {
        return expDate;
    }

    public UpItemRegion setExpDate(String expDate) {
        this.expDate = expDate;
        return this;
    }

    public String getCreater() {
        return creater;
    }

    public UpItemRegion setCreater(String creater) {
        this.creater = creater;
        return this;
    }

    public String getCreateDate() {
        return createDate;
    }

    public UpItemRegion setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    public String getModifier() {
        return modifier;
    }

    public UpItemRegion setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public UpItemRegion setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
        return this;
    }

    public String getDelFlag() {
        if (delFlag.equals("null")) {
            return delFlag;
        }
        return "'" + delFlag + "'";
    }

    public UpItemRegion setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public String toInsertSql() {
        StringBuffer sqlBuf = new StringBuffer();

        sqlBuf.append("insert into product.up_item_region\n" +
                "  (item_region_id,\n" +
                "   product_item_id,\n" +
                "   region_id,\n" +
                "   relat_region_type,\n" +
                "   item_type,\n" +
                "   eff_date,\n" +
                "   exp_date,\n" +
                "   creater,\n" +
                "   create_date,\n" +
                "   modifier,\n" +
                "   modify_date,\n" +
                "   del_flag)\n" +
                "values (\n")
                .append("   " + getItemRegionId() + ",\n")
                .append("   " + getProductItemId() + ",\n")
                .append("   " + getRegionId() + ",\n")
                .append("   " + getRelatRegionType() + ",\n")
                .append("   " + getItemType() + ",\n")
                .append("   " + getEffDate() + ",\n")
                .append("   " + getExpDate() + ",\n")
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
