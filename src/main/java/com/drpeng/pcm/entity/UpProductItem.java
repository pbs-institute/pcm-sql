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

    protected String productItemId = "null";
    protected String extendId = "0";
    protected String code = "null";
    protected String name = "null";
    protected String alphaName = "null";
    protected String itemType = "null";
    protected String priority = "null";
    protected String sortBy = "null";
    protected String description = "null";
    protected String creater = "10458";
    protected String modifier = "null";
    protected String state = "U";
    protected String delFlag = "1";
    protected String remarks = "null";
    protected String createDate = "sysdate";
    protected String modifyDate = "null";
    protected String effDate = "sysdate";
    protected String expDate = "to_date('20991231235959', 'yyyymmddhh24miss')";
    protected String entityId = "null";
    protected String checker = "null";
    protected String islock = "null";
    protected String supplierId = "null";
    protected String providerType = "null";
    protected String businessDomainId = "null";
    protected String operRegion = "null";
    protected String shortName = "null";

    private boolean isNew = true;

    protected List<UpItemFeature> relatFeatures = new ArrayList<UpItemFeature>();

    public String getProductItemId() {
        return productItemId;
    }

    public String getExtendId() {
        return extendId;
    }

    public String getCode() {
        if (code.equals("null")) {
            return code;
        }
        return "'" + code + "'";
    }

    public String getName() {
        if (name.equals("null")) {
            return name;
        }
        return "'" + name + "'";
    }

    public String getAlphaName() {
        if (alphaName.equals("null")) {
            return alphaName;
        }
        return "'" + alphaName + "'";
    }

    public String getItemType() {
        if (itemType.equals("null")) {
            return itemType;
        }
        return "'" + itemType + "'";
    }

    public String getPriority() {
        return priority;
    }

    public String getSortBy() {
        return sortBy;
    }

    public String getDescription() {
        if (description.equals("null")) {
            return description;
        }
        return "'" + description + "'";
    }

    public String getCreater() {
        return creater;
    }

    public String getModifier() {
        return modifier;
    }

    public String getState() {
        if (state.equals("null")) {
            return state;
        }
        return "'" + state + "'";
    }

    public String getDelFlag() {
        if (delFlag.equals("null")) {
            return delFlag;
        }
        return "'" + delFlag + "'";
    }

    public String getRemarks() {
        if (remarks.equals("null")) {
            return remarks;
        }
        return "'" + remarks + "'";
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public String getEffDate() {
        return effDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getChecker() {
        return checker;
    }

    public String getIslock() {
        if (islock.equals("null")) {
            return islock;
        }
        return "'" + islock + "'";
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getProviderType() {
        return providerType;
    }

    public String getBusinessDomainId() {
        return businessDomainId;
    }

    public String getOperRegion() {
        if (operRegion.equals("null")) {
            return operRegion;
        }
        return "'" + operRegion + "'";
    }

    public String getShortName() {
        if (shortName.equals("null")) {
            return shortName;
        }
        return "'" + shortName + "'";
    }

    public boolean isNew() {
        return isNew;
    }

    private UpProductItem setProductItemId(String productItemId) {
        this.productItemId = productItemId;
        return this;
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
                    .append("   " + getProductItemId() + ",\n")
                    .append("   " + getExtendId() + ",\n")
                    .append("   " + getCode() + ",\n")
                    .append("   " + getName() + ",\n")
                    .append("   " + getAlphaName() + ",\n")
                    .append("   " + getItemType() + ",\n")
                    .append("   " + getPriority() + ",\n")
                    .append("   " + getSortBy() + ",\n")
                    .append("   " + getDescription() + ",\n")
                    .append("   " + getCreater() + ",\n")
                    .append("   " + getModifier() + ",\n")
                    .append("   " + getState() + ",\n")
                    .append("   " + getDelFlag() + ",\n")
                    .append("   " + getRemarks() + ",\n")
                    .append("   " + getCreateDate() + ",\n")
                    .append("   " + getModifyDate() + ",\n")
                    .append("   " + getEffDate() + ",\n")
                    .append("   " + getExpDate() + ",\n")
                    .append("   " + getEntityId() + ",\n")
                    .append("   " + getChecker() + ",\n")
                    .append("   " + getIslock() + ",\n")
                    .append("   " + getSupplierId() + ",\n")
                    .append("   " + getProviderType() + ",\n")
                    .append("   " + getBusinessDomainId() + ",\n")
                    .append("   " + getOperRegion() + ",\n")
                    .append("   " + getShortName() + "\n")
                    .append(");\n\n")
            ;
        }

        for (UpItemFeature relatFeature : relatFeatures) {
            sqlBuf.append(relatFeature.toInsertSql());
        }

        return sqlBuf.toString();
    }
}
