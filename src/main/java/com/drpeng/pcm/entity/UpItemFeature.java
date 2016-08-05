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

    private void setFeatureRelatId(String featureRelatId) {
        this.featureRelatId = featureRelatId;
    }

    public String getProductItemId() {
        return productItemId;
    }

    public void setProductItemId(String productItemId) {
        this.productItemId = productItemId;
    }

    public String getFeatureId() {
        return featureId;
    }

    public void setFeatureId(String featureId) {
        this.featureId = featureId;
    }

    public String getFeatureValue() {
        if (featureValue.equals("null")) {
            return featureValue;
        }
        return "'" + featureValue + "'";
    }

    public void setFeatureValue(String featureValue) {
        this.featureValue = featureValue;
    }

    public String getFeatureText() {
        if (featureText.equals("null")) {
            return featureText;
        }
        return "'" + featureText + "'";
    }

    public void setFeatureText(String featureText) {
        this.featureText = featureText;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
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
