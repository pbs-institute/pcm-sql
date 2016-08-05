package com.drpeng.pcm.entity;

/**
 * Created by huangxiaomao on 8/4/2016.
 */
public class UpItemFeature extends BaseEntity {
    private String featureRelatId = "null";
    private String productItemId = "null";
    private String featureId = "null";
    private String featureValue = "null";
    private String featureText = "null";
    private String sortBy = "null";
    private String creater = "10458";
    private String createDate = "sysdate";
    private String modifier = "null";
    private String modifyDate = "null";
    private String delFlag = "1";

    private UpItemFeature() {

    }

    public UpItemFeature(String featureId, String featureValue) {
        featureRelatId = String.valueOf(getNextFeatureRelatId());
        this.featureId = featureId;
        this.featureValue = featureValue;
    }

    public String getFeatureRelatId() {
        return featureRelatId;
    }

    private UpItemFeature setFeatureRelatId(String featureRelatId) {
        this.featureRelatId = featureRelatId;
        return this;
    }

    public String getProductItemId() {
        return productItemId;
    }

    public UpItemFeature setProductItemId(String productItemId) {
        this.productItemId = productItemId;
        return this;
    }

    public String getFeatureId() {
        return featureId;
    }

    public UpItemFeature setFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }

    public String getFeatureValue() {
        if (featureValue.equals("null")) {
            return featureValue;
        }
        return "'" + featureValue + "'";
    }

    public UpItemFeature setFeatureValue(String featureValue) {
        this.featureValue = featureValue;
        return this;
    }

    public String getFeatureText() {
        if (featureText.equals("null")) {
            return featureText;
        }
        return "'" + featureText + "'";
    }

    public UpItemFeature setFeatureText(String featureText) {
        this.featureText = featureText;
        return this;
    }

    public String getSortBy() {
        return sortBy;
    }

    public UpItemFeature setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public String getCreater() {
        return creater;
    }

    public UpItemFeature setCreater(String creater) {
        this.creater = creater;
        return this;
    }

    public String getCreateDate() {
        return createDate;
    }

    public UpItemFeature setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    public String getModifier() {
        return modifier;
    }

    public UpItemFeature setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public UpItemFeature setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
        return this;
    }

    public String getDelFlag() {
        if (delFlag.equals("null")) {
            return delFlag;
        }
        return "'" + delFlag + "'";
    }

    public UpItemFeature setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public String toInsertSql() {
        StringBuffer sqlBuf = new StringBuffer();
        sqlBuf.append("insert into product.up_item_feature (\n" +
                "   feature_relat_id,\n" +
                "   product_item_id,\n" +
                "   feature_id,\n" +
                "   feature_value,\n" +
                "   feature_text,\n" +
                "   sort_by,\n" +
                "   creater,\n" +
                "   create_date,\n" +
                "   modifier,\n" +
                "   modify_date,\n" +
                "   del_flag)\n" +
                "values (\n")
                .append("   " + getFeatureRelatId() + ",\n")
                .append("   " + getProductItemId() + ",\n")
                .append("   " + getFeatureId() + ",\n")
                .append("   " + getFeatureValue() + ",\n")
                .append("   " + getFeatureText() + ",\n")
                .append("   " + getSortBy() + ",\n")
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
