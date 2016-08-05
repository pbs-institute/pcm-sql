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
    private String creater = "10458";
    private String createDate = "sysdate";
    private String modifier = "null";
    private String modifyDate = "null";
    private String delFlag = "1";

    private List<UpItemRelat> relatServices = new ArrayList<UpItemRelat>();

    public UpServicePrice() {
        super(UpProductItem.ITEM_TYPE_SRVC_SINGLE);
        this.servicePriceId = super._getProductItemId();
    }

    public UpServicePrice(String servicePriceId) {
        super(servicePriceId, UpProductItem.ITEM_TYPE_SRVC_SINGLE);
        this.servicePriceId = servicePriceId;
    }

    public String getServicePriceId() {
        return servicePriceId;
    }

    private void setServicePriceId(String servicePriceId) {
        this.servicePriceId = servicePriceId;
    }

    public String getServicePriceKind() {
        if (servicePriceKind.equals("null")) {
            return servicePriceKind;
        }
        return "'" + servicePriceKind + "'";
    }

    public void setServicePriceKind(String servicePriceKind) {
        this.servicePriceKind = servicePriceKind;
    }

    public String getIsMain() {
        return isMain;
    }

    public void setIsMain(String isMain) {
        this.isMain = isMain;
    }

    public String getSubCond() {
        if (subCond.equals("null")) {
            return subCond;
        }
        return "'" + subCond + "'";
    }

    public void setSubCond(String subCond) {
        this.subCond = subCond;
    }

    public String getSubParam() {
        if (subParam.equals("null")) {
            return subParam;
        }
        return "'" + subParam + "'";
    }

    public void setSubParam(String subParam) {
        this.subParam = subParam;
    }

    public String getPackedFlag() {
        return packedFlag;
    }

    public void setPackedFlag(String packedFlag) {
        this.packedFlag = packedFlag;
    }

    public String getMultiFlag() {
        if (multiFlag.equals("null")) {
            return multiFlag;
        }
        return "'" + multiFlag + "'";
    }

    public void setMultiFlag(String multiFlag) {
        this.multiFlag = multiFlag;
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

    public void addRelatService(UpItemRelat relatService) {
        relatService.setProdItemRelatKindId(UpItemRelat.SRVC_SINGLE_PRICE_SERVICE);
        relatService.setProductItemId(servicePriceId);
        relatServices.add(relatService);
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
