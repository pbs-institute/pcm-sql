package com.drpeng.pcm.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangxiaomao on 8/2/2016.
 */
public class UpServicePrice extends UpProductItem {

    public static final String SERVICE_PRICE_KIND_SRVC_SINGLE = "SRVC_SINGLE";
    public static final String SERVICE_PRICE_KIND_PROD_SPROM = "PROD_SPROM";

    private String servicePriceId = "null";
    private String servicePriceKind = "null";
    private String isMain = "0";
    private String subCond = "null";
    private String subParam = "null";
    private String packedFlag = "null";
    private String multiFlag = "null";

    // ---- Methods of UpProductItem Begin ----
    public UpServicePrice setExtendId(String extendId) {
        this.extendId = extendId;
        return this;
    }

    public UpServicePrice setCode(String code) {
        this.code = code;
        return this;
    }

    public UpServicePrice setName(String name) {
        this.name = name;
        return this;
    }

    public UpServicePrice setAlphaName(String alphaName) {
        this.alphaName = alphaName;
        return this;
    }

    public UpServicePrice setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    public UpServicePrice setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public UpServicePrice setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public UpServicePrice setDescription(String description) {
        this.description = description;
        return this;
    }

    public UpServicePrice setCreater(String creater) {
        this.creater = creater;
        return this;
    }

    public UpServicePrice setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public UpServicePrice setState(String state) {
        this.state = state;
        return this;
    }

    public UpServicePrice setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public UpServicePrice setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public UpServicePrice setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    public UpServicePrice setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
        return this;
    }

    public UpServicePrice setEffDate(String effDate) {
        this.effDate = effDate;
        return this;
    }

    public UpServicePrice setExpDate(String expDate) {
        this.expDate = expDate;
        return this;
    }

    public UpServicePrice setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    public UpServicePrice setChecker(String checker) {
        this.checker = checker;
        return this;
    }

    public UpServicePrice setIslock(String islock) {
        this.islock = islock;
        return this;
    }

    public UpServicePrice setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public UpServicePrice setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    public UpServicePrice setBusinessDomainId(String businessDomainId) {
        this.businessDomainId = businessDomainId;
        return this;
    }

    public UpServicePrice setOperRegion(String operRegion) {
        this.operRegion = operRegion;
        return this;
    }

    public UpServicePrice setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public UpServicePrice addFeature(UpItemFeature relatFeature) {
        relatFeature.setProductItemId(productItemId);
        relatFeatures.add(relatFeature);
        return this;
    }
    // ---- Methods of UpProductItem End ----

    private List<UpItemRelat> relatServices = new ArrayList<UpItemRelat>();

    public UpServicePrice() {
        super(UpProductItem.ITEM_TYPE_SRVC_SINGLE);
        this.servicePriceId = super.getProductItemId();
    }

    public UpServicePrice(String servicePriceId) {
        super(servicePriceId, UpProductItem.ITEM_TYPE_SRVC_SINGLE);
        this.servicePriceId = servicePriceId;
    }

    public String getServicePriceId() {
        return servicePriceId;
    }

    private UpServicePrice setServicePriceId(String servicePriceId) {
        this.servicePriceId = servicePriceId;
        return this;
    }

    public String getServicePriceKind() {
        if (servicePriceKind.equals("null")) {
            return servicePriceKind;
        }
        return "'" + servicePriceKind + "'";
    }

    public UpServicePrice setServicePriceKind(String servicePriceKind) {
        this.servicePriceKind = servicePriceKind;
        return this;
    }

    public String getIsMain() {
        return isMain;
    }

    public UpServicePrice setIsMain(String isMain) {
        this.isMain = isMain;
        return this;
    }

    public String getSubCond() {
        if (subCond.equals("null")) {
            return subCond;
        }
        return "'" + subCond + "'";
    }

    public UpServicePrice setSubCond(String subCond) {
        this.subCond = subCond;
        return this;
    }

    public String getSubParam() {
        if (subParam.equals("null")) {
            return subParam;
        }
        return "'" + subParam + "'";
    }

    public UpServicePrice setSubParam(String subParam) {
        this.subParam = subParam;
        return this;
    }

    public String getPackedFlag() {
        return packedFlag;
    }

    public UpServicePrice setPackedFlag(String packedFlag) {
        this.packedFlag = packedFlag;
        return this;
    }

    public String getMultiFlag() {
        if (multiFlag.equals("null")) {
            return multiFlag;
        }
        return "'" + multiFlag + "'";
    }

    public UpServicePrice setMultiFlag(String multiFlag) {
        this.multiFlag = multiFlag;
        return this;
    }

    public UpServicePrice addRelatService(UpItemRelat relatService) {
        relatService.setProdItemRelatKindId(UpItemRelat.SRVC_SINGLE_PRICE_SERVICE);
        relatService.setProductItemId(servicePriceId);
        relatServices.add(relatService);
        return this;
    }

    public String toInsertSql() {
        String superSql = super.toInsertSql();
        StringBuffer sqlBuf = new StringBuffer(superSql);

        if (isNew()) {
            sqlBuf.append("insert into product.up_service_price\n" +
                    "  (service_price_id,\n" +
                    "   service_price_kind,\n" +
                    "   is_main,\n" +
                    "   sub_cond,\n" +
                    "   sub_param,\n" +
                    "   packed_flag,\n" +
                    "   multi_flag,\n" +
                    "   creater,\n" +
                    "   create_date,\n" +
                    "   modifier,\n" +
                    "   modify_date,\n" +
                    "   del_flag)\n" +
                    "values (\n")
                    .append("   " + getServicePriceId() + ",\n")
                    .append("   " + getServicePriceKind() + ",\n")
                    .append("   " + getIsMain() + ",\n")
                    .append("   " + getSubCond() + ",\n")
                    .append("   " + getSubParam() + ",\n")
                    .append("   " + getPackedFlag() + ",\n")
                    .append("   " + getMultiFlag() + ",\n")
                    .append("   " + getCreater() + ",\n")
                    .append("   " + getCreateDate() + ",\n")
                    .append("   " + getModifier() + ",\n")
                    .append("   " + getModifyDate() + ",\n")
                    .append("   " + getDelFlag() + "\n")
                    .append(");\n\n")
            ;
        }

        for(UpItemRelat relatService : relatServices) {
            sqlBuf.append(relatService.toInsertSql());
        }

        return sqlBuf.toString();
    }
}
