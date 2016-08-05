package com.drpeng.pcm.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangxiaomao on 7/28/2016.
 */
public class UpProductItem extends BaseEntity {

    public static final String ITEM_TYPE_OFFER_PLAN = "OFFER_PLAN";
    public static final String ITEM_TYPE_SRVC_SINGLE = "SRVC_SINGLE";
    public static final String ITEM_TYPE_SERVICE = "SERVICE";
    public static final String ITEM_TYPE_PRICE_PLAN = "PRICE_PLAN";
    public static final String ITEM_TYPE_BUSINESS_OPERATION = "BUSINESS_OPERATION";
    public static final String ITEM_TYPE_SPEC_ROLE = "SPEC_ROLE";

    private String productItemId = "null";
    private String extendId = "0";
    private String code = "null";
    private String name = "null";
    private String alphaName = "null";
    private String itemType = "null";
    private String priority = "null";
    private String sortBy = "null";
    private String description = "null";
    private String creater = "10458";
    private String modifier = "null";
    private String state = "U";
    private String delFlag = "1";
    private String remarks = "null";
    private String createDate = "sysdate";
    private String modifyDate = "null";
    private String effDate = "sysdate";
    private String expDate = "to_date('20991231235959', 'yyyymmddhh24miss')";
    private String entityId = "null";
    private String checker = "null";
    private String islock = "null";
    private String supplierId = "null";
    private String providerType = "null";
    private String businessDomainId = "null";
    private String operRegion = "null";
    private String shortName = "null";

    private boolean isNew = true;

    private List<UpItemFeature> relatFeatures = new ArrayList<UpItemFeature>();

    public String _getProductItemId() {
        return productItemId;
    }

    public String _getExtendId() {
        return extendId;
    }

    public String _getCode() {
        if (code.equals("null")) {
            return code;
        }
        return "'" + code + "'";
    }

    public String _getName() {
        if (name.equals("null")) {
            return name;
        }
        return "'" + name + "'";
    }

    public String _getAlphaName() {
        if (alphaName.equals("null")) {
            return alphaName;
        }
        return "'" + alphaName + "'";
    }

    public String _getItemType() {
        if (itemType.equals("null")) {
            return itemType;
        }
        return "'" + itemType + "'";
    }

    public String _getPriority() {
        return priority;
    }

    public String _getSortBy() {
        return sortBy;
    }

    public String _getDescription() {
        if (description.equals("null")) {
            return description;
        }
        return "'" + description + "'";
    }

    public String _getCreater() {
        return creater;
    }

    public String _getModifier() {
        return modifier;
    }

    public String _getState() {
        if (state.equals("null")) {
            return state;
        }
        return "'" + state + "'";
    }

    public String _getDelFlag() {
        if (delFlag.equals("null")) {
            return delFlag;
        }
        return "'" + delFlag + "'";
    }

    public String _getRemarks() {
        if (remarks.equals("null")) {
            return remarks;
        }
        return "'" + remarks + "'";
    }

    public String _getCreateDate() {
        return createDate;
    }

    public String _getModifyDate() {
        return modifyDate;
    }

    public String _getEffDate() {
        return effDate;
    }

    public String _getExpDate() {
        return expDate;
    }

    public String _getEntityId() {
        return entityId;
    }

    public String _getChecker() {
        return checker;
    }

    public String _getIslock() {
        if (islock.equals("null")) {
            return islock;
        }
        return "'" + islock + "'";
    }

    public String _getSupplierId() {
        return supplierId;
    }

    public String _getProviderType() {
        return providerType;
    }

    public String _getBusinessDomainId() {
        return businessDomainId;
    }

    public String _getOperRegion() {
        if (operRegion.equals("null")) {
            return operRegion;
        }
        return "'" + operRegion + "'";
    }

    public String _getShortName() {
        if (shortName.equals("null")) {
            return shortName;
        }
        return "'" + shortName + "'";
    }

    public boolean isNew() {
        return isNew;
    }

    private void _setProductItemId(String productItemId) {
        this.productItemId = productItemId;
    }

    public void _setExtendId(String extendId) {
        this.extendId = extendId;
    }

    public void _setCode(String code) {
        this.code = code;
    }

    public void _setName(String name) {
        this.name = name;
    }

    public void _setAlphaName(String alphaName) {
        this.alphaName = alphaName;
    }

    public void _setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void _setPriority(String priority) {
        this.priority = priority;
    }

    public void _setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public void _setDescription(String description) {
        this.description = description;
    }

    public void _setCreater(String creater) {
        this.creater = creater;
    }

    public void _setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void _setState(String state) {
        this.state = state;
    }

    public void _setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public void _setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void _setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void _setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public void _setEffDate(String effDate) {
        this.effDate = effDate;
    }

    public void _setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void _setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public void _setChecker(String checker) {
        this.checker = checker;
    }

    public void _setIslock(String islock) {
        this.islock = islock;
    }

    public void _setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public void _setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public void _setBusinessDomainId(String businessDomainId) {
        this.businessDomainId = businessDomainId;
    }

    public void _setOperRegion(String operRegion) {
        this.operRegion = operRegion;
    }

    public void _setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void _addFeature(UpItemFeature relatFeature) {
        relatFeature.setProductItemId(productItemId);
        relatFeatures.add(relatFeature);
    }

    public UpProductItem(String itemType) {
        this.itemType = itemType;
        isNew = true;
        productItemId = getNextProductItemId(itemType);
    }

    public UpProductItem(String productItemId, String itemType) {
        this.productItemId = productItemId;
        this.itemType = itemType;
        isNew = false;
    }

    private String getNextProductItemId(String itemType) {
        if (null == itemType || itemType.equals("")) {
            return "";
        }

        if (itemType.equals(ITEM_TYPE_OFFER_PLAN)) {
            return String.valueOf(getNextOfferId());
        } else if (itemType.equals(ITEM_TYPE_SRVC_SINGLE)) {
            return String.valueOf(getNextProductId());
        } else if (itemType.equals(ITEM_TYPE_SERVICE)) {
            return String.valueOf(getNextServiceId());
        } else if (itemType.equals(ITEM_TYPE_PRICE_PLAN)) {
            return String.valueOf(getNextPricePlanId());
        }

        return "";
    }

    public String toInsertSql() {
        StringBuffer sqlBuf = new StringBuffer();
        if (isNew()) {
            sqlBuf.append("insert into product.up_product_item (\n" +
                    "   product_item_id,\n" +
                    "   extend_id,\n" +
                    "   code,\n" +
                    "   name,\n" +
                    "   alpha_name,\n" +
                    "   item_type,\n" +
                    "   priority,\n" +
                    "   sort_by,\n" +
                    "   description,\n" +
                    "   creater,\n" +
                    "   modifier,\n" +
                    "   state,\n" +
                    "   del_flag,\n" +
                    "   remarks,\n" +
                    "   create_date,\n" +
                    "   modify_date,\n" +
                    "   eff_date,\n" +
                    "   exp_date,\n" +
                    "   entity_id,\n" +
                    "   checker,\n" +
                    "   islock,\n" +
                    "   supplier_id,\n" +
                    "   provider_type,\n" +
                    "   business_domain_id,\n" +
                    "   oper_region,\n" +
                    "   short_name)\n" +
                    "values (\n")
                    .append("   " + _getProductItemId() + ",\n")
                    .append("   " + _getExtendId() + ",\n")
                    .append("   " + _getCode() + ",\n")
                    .append("   " + _getName() + ",\n")
                    .append("   " + _getAlphaName() + ",\n")
                    .append("   " + _getItemType() + ",\n")
                    .append("   " + _getPriority() + ",\n")
                    .append("   " + _getSortBy() + ",\n")
                    .append("   " + _getDescription() + ",\n")
                    .append("   " + _getCreater() + ",\n")
                    .append("   " + _getModifier() + ",\n")
                    .append("   " + _getState() + ",\n")
                    .append("   " + _getDelFlag() + ",\n")
                    .append("   " + _getRemarks() + ",\n")
                    .append("   " + _getCreateDate() + ",\n")
                    .append("   " + _getModifyDate() + ",\n")
                    .append("   " + _getEffDate() + ",\n")
                    .append("   " + _getExpDate() + ",\n")
                    .append("   " + _getEntityId() + ",\n")
                    .append("   " + _getChecker() + ",\n")
                    .append("   " + _getIslock() + ",\n")
                    .append("   " + _getSupplierId() + ",\n")
                    .append("   " + _getProviderType() + ",\n")
                    .append("   " + _getBusinessDomainId() + ",\n")
                    .append("   " + _getOperRegion() + ",\n")
                    .append("   " + _getShortName() + "\n")
                    .append(");\n\n")
            ;
        }

        for (UpItemFeature relatFeature : relatFeatures) {
            sqlBuf.append(relatFeature.toInsertSql());
        }

        return sqlBuf.toString();
    }
}
