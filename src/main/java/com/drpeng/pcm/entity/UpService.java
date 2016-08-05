package com.drpeng.pcm.entity;

/**
 * Created by huangxiaomao on 7/29/2016.
 */
public class UpService extends UpProductItem {
    private String serviceId = "null";
    private String serviceType = "null";
    private String serviceLevel = "null";
    private String needRegister = "null";
    private String psType = "null";
    private String psServiceType = "null";
    private String baseFlag = "null";
    private String recordTableName = "null";
    private String displayType = "null";
    private String allowMulti = "null";
    private String hasAccountFee = "null";
    private String accountFeeType = "null";

    // ---- Methods of UpProductItem Begin ----
    public UpService setExtendId(String extendId) {
        this.extendId = extendId;
        return this;
    }

    public UpService setCode(String code) {
        this.code = code;
        return this;
    }

    public UpService setName(String name) {
        this.name = name;
        return this;
    }

    public UpService setAlphaName(String alphaName) {
        this.alphaName = alphaName;
        return this;
    }

    public UpService setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    public UpService setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public UpService setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public UpService setDescription(String description) {
        this.description = description;
        return this;
    }

    public UpService setCreater(String creater) {
        this.creater = creater;
        return this;
    }

    public UpService setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public UpService setState(String state) {
        this.state = state;
        return this;
    }

    public UpService setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public UpService setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public UpService setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    public UpService setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
        return this;
    }

    public UpService setEffDate(String effDate) {
        this.effDate = effDate;
        return this;
    }

    public UpService setExpDate(String expDate) {
        this.expDate = expDate;
        return this;
    }

    public UpService setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    public UpService setChecker(String checker) {
        this.checker = checker;
        return this;
    }

    public UpService setIslock(String islock) {
        this.islock = islock;
        return this;
    }

    public UpService setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public UpService setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    public UpService setBusinessDomainId(String businessDomainId) {
        this.businessDomainId = businessDomainId;
        return this;
    }

    public UpService setOperRegion(String operRegion) {
        this.operRegion = operRegion;
        return this;
    }

    public UpService setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public UpService addFeature(UpItemFeature relatFeature) {
        relatFeature.setProductItemId(productItemId);
        relatFeatures.add(relatFeature);
        return this;
    }
    // ---- Methods of UpProductItem End ----

    public UpService() {
        super(UpProductItem.ITEM_TYPE_SERVICE);
        this.serviceId = super.getProductItemId();
    }

    public UpService(String serviceId) {
        super(serviceId, UpProductItem.ITEM_TYPE_SERVICE);
        this.serviceId = serviceId;
    }

    public String getServiceId() {
        return serviceId;
    }

    private UpService setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public String getServiceType() {
        return serviceType;
    }

    public UpService setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public UpService setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
        return this;
    }

    public String getNeedRegister() {
        return needRegister;
    }

    public UpService setNeedRegister(String needRegister) {
        this.needRegister = needRegister;
        return this;
    }

    public String getPsType() {
        return psType;
    }

    public UpService setPsType(String psType) {
        this.psType = psType;
        return this;
    }

    public String getPsServiceType() {
        return psServiceType;
    }

    public UpService setPsServiceType(String psServiceType) {
        this.psServiceType = psServiceType;
        return this;
    }

    public String getBaseFlag() {
        if (baseFlag.equals("null")) {
            return baseFlag;
        }
        return "'" + baseFlag + "'";
    }

    public UpService setBaseFlag(String baseFlag) {
        this.baseFlag = baseFlag;
        return this;
    }

    public String getRecordTableName() {
        if (recordTableName.equals("null")) {
            return recordTableName;
        }
        return "'" + recordTableName + "'";
    }

    public UpService setRecordTableName(String recordTableName) {
        this.recordTableName = recordTableName;
        return this;
    }

    public String getDisplayType() {
        if (displayType.equals("null")) {
            return displayType;
        }
        return "'" + displayType + "'";
    }

    public UpService setDisplayType(String displayType) {
        this.displayType = displayType;
        return this;
    }

    public String getAllowMulti() {
        return allowMulti;
    }

    public UpService setAllowMulti(String allowMulti) {
        this.allowMulti = allowMulti;
        return this;
    }

    public String getHasAccountFee() {
        return hasAccountFee;
    }

    public UpService setHasAccountFee(String hasAccountFee) {
        this.hasAccountFee = hasAccountFee;
        return this;
    }

    public String getAccountFeeType() {
        return accountFeeType;
    }

    public UpService setAccountFeeType(String accountFeeType) {
        this.accountFeeType = accountFeeType;
        return this;
    }

    public String toInsertSql() {
        String superSql = super.toInsertSql();
        StringBuffer sqlBuf = new StringBuffer(superSql);

        if (!isNew()) {
            return sqlBuf.toString();
        }

        sqlBuf.append("insert into product.up_service (\n" +
                "   service_id,\n" +
                "   service_type,\n" +
                "   service_level,\n" +
                "   need_register,\n" +
                "   ps_type,\n" +
                "   ps_service_type,\n" +
                "   base_flag,\n" +
                "   record_table_name,\n" +
                "   display_type,\n" +
                "   allow_multi,\n" +
                "   creater,\n" +
                "   create_date,\n" +
                "   modifier,\n" +
                "   modify_date,\n" +
                "   del_flag,\n" +
                "   has_account_fee,\n" +
                "   account_fee_type)\n" +
                "values (\n")
                .append("   " + getServiceId() + ",\n")
                .append("   " + getServiceType() + ",\n")
                .append("   " + getServiceLevel() + ",\n")
                .append("   " + getNeedRegister() + ",\n")
                .append("   " + getPsType() + ",\n")
                .append("   " + getPsServiceType() + ",\n")
                .append("   " + getBaseFlag() + ",\n")
                .append("   " + getRecordTableName() + ",\n")
                .append("   " + getDisplayType() + ",\n")
                .append("   " + getAllowMulti() + ",\n")
                .append("   " + getCreater() + ",\n")
                .append("   " + getCreateDate() + ",\n")
                .append("   " + getModifier() + ",\n")
                .append("   " + getModifyDate() + ",\n")
                .append("   " + getDelFlag() + ",\n")
                .append("   " + getHasAccountFee() + ",\n")
                .append("   " + getAccountFeeType() + "\n")
                .append(");\n\n")
        ;

        return sqlBuf.toString();
    }
}
