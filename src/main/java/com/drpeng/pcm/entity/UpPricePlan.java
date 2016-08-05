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
    private String creater = "10458";
    private String createDate = "null";
    private String modifier = "null";
    private String modifyDate = "null";
    private String delFlag = "1";

    public UpPricePlan() {
        super(UpProductItem.ITEM_TYPE_PRICE_PLAN);
        this.pricePlanId = super._getProductItemId();
    }

    public UpPricePlan(String pricePlanId) {
        super(pricePlanId, UpProductItem.ITEM_TYPE_PRICE_PLAN);
        this.pricePlanId = pricePlanId;
    }

    public String getPricePlanId() {
        return pricePlanId;
    }

    private void setPricePlanId(String pricePlanId) {
        this.pricePlanId = pricePlanId;
    }

    public String getPricePlanTypeCd() {
        if (pricePlanTypeCd.equals("null")) {
            return pricePlanTypeCd;
        }
        return "'" + pricePlanTypeCd + "'";
    }

    public void setPricePlanTypeCd(String pricePlanTypeCd) {
        this.pricePlanTypeCd = pricePlanTypeCd;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getBalanceCode() {
        return balanceCode;
    }

    public void setBalanceCode(String balanceCode) {
        this.balanceCode = balanceCode;
    }

    public String getSpecialPayment() {
        return specialPayment;
    }

    public void setSpecialPayment(String specialPayment) {
        this.specialPayment = specialPayment;
    }

    public String getAccCode() {
        return accCode;
    }

    public void setAccCode(String accCode) {
        this.accCode = accCode;
    }

    public String getParaFlag() {
        if (paraFlag.equals("null")) {
            return paraFlag;
        }
        return "'" + paraFlag + "'";
    }

    public void setParaFlag(String paraFlag) {
        this.paraFlag = paraFlag;
    }

    public String getInterfaceCode() {
        if (interfaceCode.equals("null")) {
            return interfaceCode;
        }
        return "'" + paraFlag + "'";
    }

    public void setInterfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
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
