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
    private String creater = "10458";
    private String createDate = "sysdate";
    private String modifier = "null";
    private String modifyDate = "null";
    private String delFlag = "1";
    private String hasAccountFee = "null";
    private String accountFeeType = "null";

    public UpService() {
        super(UpProductItem.ITEM_TYPE_SERVICE);
        this.serviceId = super._getProductItemId();
    }

    public UpService(String serviceId) {
        super(serviceId, UpProductItem.ITEM_TYPE_SERVICE);
        this.serviceId = serviceId;
    }

    public String getServiceId() {
        return serviceId;
    }

    private void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getNeedRegister() {
        return needRegister;
    }

    public void setNeedRegister(String needRegister) {
        this.needRegister = needRegister;
    }

    public String getPsType() {
        return psType;
    }

    public void setPsType(String psType) {
        this.psType = psType;
    }

    public String getPsServiceType() {
        return psServiceType;
    }

    public void setPsServiceType(String psServiceType) {
        this.psServiceType = psServiceType;
    }

    public String getBaseFlag() {
        if (baseFlag.equals("null")) {
            return baseFlag;
        }
        return "'" + baseFlag + "'";
    }

    public void setBaseFlag(String baseFlag) {
        this.baseFlag = baseFlag;
    }

    public String getRecordTableName() {
        if (recordTableName.equals("null")) {
            return recordTableName;
        }
        return "'" + recordTableName + "'";
    }

    public void setRecordTableName(String recordTableName) {
        this.recordTableName = recordTableName;
    }

    public String getDisplayType() {
        if (displayType.equals("null")) {
            return displayType;
        }
        return "'" + displayType + "'";
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getAllowMulti() {
        return allowMulti;
    }

    public void setAllowMulti(String allowMulti) {
        this.allowMulti = allowMulti;
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

    public String getHasAccountFee() {
        return hasAccountFee;
    }

    public void setHasAccountFee(String hasAccountFee) {
        this.hasAccountFee = hasAccountFee;
    }

    public String getAccountFeeType() {
        return accountFeeType;
    }

    public void setAccountFeeType(String accountFeeType) {
        this.accountFeeType = accountFeeType;
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
