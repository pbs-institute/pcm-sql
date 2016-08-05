package com.drpeng.pcm.entity;

/**
 * Created by huangxiaomao on 8/2/2016.
 */
public class UpPricePlan extends UpProductItem {
    public static final String PRICE_PLAN_AWARD_APPORT_PREPAY = "PRICE_PLAN_AWARD_APPORT_PREPAY";
    public static final String PRICE_PLAN_AWARD_SCORE = "PRICE_PLAN_AWARD_SCORE";
    public static final String PRICE_PLAN_BUSI_APPORT_PREPAY = "PRICE_PLAN_BUSI_APPORT_PREPAY";
    public static final String PRICE_PLAN_BUSI_CARD = "PRICE_PLAN_BUSI_CARD";
    public static final String PRICE_PLAN_BUSI_DEPOSIT = "PRICE_PLAN_BUSI_DEPOSIT";
    public static final String PRICE_PLAN_BUSI_NORMAL = "PRICE_PLAN_BUSI_NORMAL";
    public static final String PRICE_PLAN_BUSI_PREPAY = "PRICE_PLAN_BUSI_PREPAY";
    public static final String PRICE_PLAN_BUSI_RETURN = "PRICE_PLAN_BUSI_RETURN";
    public static final String PRICE_PLAN_BUSI_TRANS = "PRICE_PLAN_BUSI_TRANS";
    public static final String PRICE_PLAN_RES_TERMINAL = "PRICE_PLAN_RES_TERMINAL";

    private String pricePlanId = "null";
    private String pricePlanTypeCd = "null";
    private String feeAmount = "null";
    private String balanceCode = "null";
    private String specialPayment = "null";
    private String accCode = "null";
    private String paraFlag = "N";
    private String interfaceCode = "null";

    // ---- Methods of UpProductItem Begin ----
    public UpPricePlan setExtendId(String extendId) {
        this.extendId = extendId;
        return this;
    }

    public UpPricePlan setCode(String code) {
        this.code = code;
        return this;
    }

    public UpPricePlan setName(String name) {
        this.name = name;
        return this;
    }

    public UpPricePlan setAlphaName(String alphaName) {
        this.alphaName = alphaName;
        return this;
    }

    public UpPricePlan setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    public UpPricePlan setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public UpPricePlan setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public UpPricePlan setDescription(String description) {
        this.description = description;
        return this;
    }

    public UpPricePlan setCreater(String creater) {
        this.creater = creater;
        return this;
    }

    public UpPricePlan setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public UpPricePlan setState(String state) {
        this.state = state;
        return this;
    }

    public UpPricePlan setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public UpPricePlan setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public UpPricePlan setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    public UpPricePlan setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
        return this;
    }

    public UpPricePlan setEffDate(String effDate) {
        this.effDate = effDate;
        return this;
    }

    public UpPricePlan setExpDate(String expDate) {
        this.expDate = expDate;
        return this;
    }

    public UpPricePlan setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    public UpPricePlan setChecker(String checker) {
        this.checker = checker;
        return this;
    }

    public UpPricePlan setIslock(String islock) {
        this.islock = islock;
        return this;
    }

    public UpPricePlan setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public UpPricePlan setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    public UpPricePlan setBusinessDomainId(String businessDomainId) {
        this.businessDomainId = businessDomainId;
        return this;
    }

    public UpPricePlan setOperRegion(String operRegion) {
        this.operRegion = operRegion;
        return this;
    }

    public UpPricePlan setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public UpPricePlan addFeature(UpItemFeature relatFeature) {
        relatFeature.setProductItemId(productItemId);
        relatFeatures.add(relatFeature);
        return this;
    }
    // ---- Methods of UpProductItem End ----

    public UpPricePlan() {
        super(UpProductItem.ITEM_TYPE_PRICE_PLAN);
        this.pricePlanId = super.getProductItemId();
    }

    public UpPricePlan(String pricePlanId) {
        super(pricePlanId, UpProductItem.ITEM_TYPE_PRICE_PLAN);
        this.pricePlanId = pricePlanId;
    }

    public String getPricePlanId() {
        return pricePlanId;
    }

    private UpPricePlan setPricePlanId(String pricePlanId) {
        this.pricePlanId = pricePlanId;
        return this;
    }

    public String getPricePlanTypeCd() {
        if (pricePlanTypeCd.equals("null")) {
            return pricePlanTypeCd;
        }
        return "'" + pricePlanTypeCd + "'";
    }

    public UpPricePlan setPricePlanTypeCd(String pricePlanTypeCd) {
        this.pricePlanTypeCd = pricePlanTypeCd;
        return this;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public UpPricePlan setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    public String getBalanceCode() {
        return balanceCode;
    }

    public UpPricePlan setBalanceCode(String balanceCode) {
        this.balanceCode = balanceCode;
        return this;
    }

    public String getSpecialPayment() {
        return specialPayment;
    }

    public UpPricePlan setSpecialPayment(String specialPayment) {
        this.specialPayment = specialPayment;
        return this;
    }

    public String getAccCode() {
        return accCode;
    }

    public UpPricePlan setAccCode(String accCode) {
        this.accCode = accCode;
        return this;
    }

    public String getParaFlag() {
        if (paraFlag.equals("null")) {
            return paraFlag;
        }
        return "'" + paraFlag + "'";
    }

    public UpPricePlan setParaFlag(String paraFlag) {
        this.paraFlag = paraFlag;
        return this;
    }

    public String getInterfaceCode() {
        if (interfaceCode.equals("null")) {
            return interfaceCode;
        }
        return "'" + paraFlag + "'";
    }

    public UpPricePlan setInterfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    public String toInsertSql() {
        String superSql = super.toInsertSql();
        StringBuffer sqlBuf = new StringBuffer(superSql);

        if (!isNew()) {
            return sqlBuf.toString();
        }

        sqlBuf.append("insert into product.up_price_plan\n" +
                "  (price_plan_id,\n" +
                "   price_plan_type_cd,\n" +
                "   fee_amount,\n" +
                "   balance_code,\n" +
                "   special_payment,\n" +
                "   acc_code,\n" +
                "   para_flag,\n" +
                "   interface_code,\n" +
                "   creater,\n" +
                "   create_date,\n" +
                "   modifier,\n" +
                "   modify_date,\n" +
                "   del_flag)\n" +
                "values (\n")
                .append("   " + getPricePlanId() + ",\n")
                .append("   " + getPricePlanTypeCd() + ",\n")
                .append("   " + getFeeAmount() + ",\n")
                .append("   " + getBalanceCode() + ",\n")
                .append("   " + getSpecialPayment() + ",\n")
                .append("   " + getAccCode() + ",\n")
                .append("   " + getParaFlag() + ",\n")
                .append("   " + getInterfaceCode() + ",\n")
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
