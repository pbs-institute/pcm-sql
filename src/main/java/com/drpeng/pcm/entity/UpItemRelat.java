package com.drpeng.pcm.entity;

/**
 * Created by huangxiaomao on 8/2/2016.
 */
public class UpItemRelat extends BaseEntity {

    public static final String BUSINESS_GENERAL_PRICE_PLAN_BUSI_CARD = "BUSINESS_GENERAL_PRICE_PLAN_BUSI_CARD";
    public static final String BUSINESS_GENERAL_PRICE_PLAN_PKG_BUSI = "BUSINESS_GENERAL_PRICE_PLAN_PKG_BUSI";
    public static final String OFFER_PLAN_GENERAL_BUSINESS = "OFFER_PLAN_GENERAL_BUSINESS";
    public static final String OFFER_PLAN_GENERAL_EXCHANGE_PROGRAM = "OFFER_PLAN_GENERAL_EXCHANGE_PROGRAM";
    public static final String OFFER_PLAN_GENERAL_PRICE_PLAN_PKG_BUSI = "OFFER_PLAN_GENERAL_PRICE_PLAN_PKG_BUSI";
    public static final String OFFER_PLAN_GENERAL_SPEC_ROLE = "OFFER_PLAN_GENERAL_SPEC_ROLE";
    public static final String OFFER_PLAN_GENERAL_SUB_TRADEMARK = "OFFER_PLAN_GENERAL_SUB_TRADEMARK";
    public static final String OFFER_PLAN_INCLUDED_OFFER_KIND = "OFFER_PLAN_INCLUDED_OFFER_KIND";
    public static final String PRICE_PLAN_GENERAL_APPORTION_RULE = "PRICE_PLAN_GENERAL_APPORTION_RULE";
    public static final String SERVICE_GENERAL_ATTRIBUTE_SINGLE = "SERVICE_GENERAL_ATTRIBUTE_SINGLE";
    public static final String SRVC_SINGLE_MUTEX_SRVC_SINGLE = "SRVC_SINGLE_MUTEX_SRVC_SINGLE";
    public static final String SRVC_SINGLE_PRICE_SERVICE = "SRVC_SINGLE_PRICE_SERVICE";

    protected String tableName = "product.up_item_relat";

    private String itemRelatId = "null";
    private String productItemId = "null";
    private String relatProductItemId = "null";
    private String prodItemRelatKindId = "null";
    private String extendAttrA = "null";
    private String extendAttrB = "null";
    private String extendAttrC = "null";
    private String extendAttrD = "null";
    private String extendAttrE = "null";
    private String extendAttrF = "null";
    private String extendAttrG = "null";
    private String extendAttrH = "null";
    private String extendAttrI = "null";
    private String extendAttrJ = "null";
    private String extendAttrK = "null";
    private String extendAttrL = "null";
    private String extendAttrM = "null";
    private String extendAttrN = "null";
    private String extendAttrO = "null";
    private String sortBy = "null";
    private String creater = "10458";
    private String createDate = "sysdate";
    private String modifier = "null";
    private String modifyDate = "null";
    private String delFlag = "1";
    private String applyRegion = "null";
    private String priority = "null";

    private UpProductItem relatProductItem = null;

    public UpItemRelat(UpProductItem relatProductItem) {
        this.relatProductItem = relatProductItem;
        relatProductItemId = this.relatProductItem.getProductItemId();
        itemRelatId = String.valueOf(getNextItemRelatId());
    }

    public String getItemRelatId() {
        return itemRelatId;
    }

    private UpItemRelat setItemRelatId(String itemRelatId) {
        this.itemRelatId = itemRelatId;
        return this;
    }

    public String getProductItemId() {
        return productItemId;
    }

    public UpItemRelat setProductItemId(String productItemId) {
        this.productItemId = productItemId;
        return this;
    }

    public String getRelatProductItemId() {
        return relatProductItemId;
    }

    public UpItemRelat setRelatProductItemId(String relatProductItemId) {
        this.relatProductItemId = relatProductItemId;
        return this;
    }

    public String getProdItemRelatKindId() {
        if (prodItemRelatKindId.equals("null")) {
            return prodItemRelatKindId;
        }
        return "'" + prodItemRelatKindId + "'";
    }

    public UpItemRelat setProdItemRelatKindId(String prodItemRelatKindId) {
        this.prodItemRelatKindId = prodItemRelatKindId;
        return this;
    }

    public String getExtendAttrA() {
        if (extendAttrA.equals("null")) {
            return extendAttrA;
        }
        return "'" + extendAttrA + "'";
    }

    public UpItemRelat setExtendAttrA(String extendAttrA) {
        this.extendAttrA = extendAttrA;
        return this;
    }

    public String getExtendAttrB() {
        if (extendAttrB.equals("null")) {
            return extendAttrB;
        }
        return "'" + extendAttrB + "'";
    }

    public UpItemRelat setExtendAttrB(String extendAttrB) {
        this.extendAttrB = extendAttrB;
        return this;
    }

    public String getExtendAttrC() {
        if (extendAttrC.equals("null")) {
            return extendAttrC;
        }
        return "'" + extendAttrC + "'";
    }

    public UpItemRelat setExtendAttrC(String extendAttrC) {
        this.extendAttrC = extendAttrC;
        return this;
    }

    public String getExtendAttrD() {
        if (extendAttrD.equals("null")) {
            return extendAttrD;
        }
        return "'" + extendAttrD + "'";
    }

    public UpItemRelat setExtendAttrD(String extendAttrD) {
        this.extendAttrD = extendAttrD;
        return this;
    }

    public String getExtendAttrE() {
        if (extendAttrE.equals("null")) {
            return extendAttrE;
        }
        return "'" + extendAttrE + "'";
    }

    public UpItemRelat setExtendAttrE(String extendAttrE) {
        this.extendAttrE = extendAttrE;
        return this;
    }

    public String getExtendAttrF() {
        if (extendAttrF.equals("null")) {
            return extendAttrF;
        }
        return "'" + extendAttrF + "'";
    }

    public UpItemRelat setExtendAttrF(String extendAttrF) {
        this.extendAttrF = extendAttrF;
        return this;
    }

    public String getExtendAttrG() {
        if (extendAttrG.equals("null")) {
            return extendAttrG;
        }
        return "'" + extendAttrG + "'";
    }

    public UpItemRelat setExtendAttrG(String extendAttrG) {
        this.extendAttrG = extendAttrG;
        return this;
    }

    public String getExtendAttrH() {
        if (extendAttrH.equals("null")) {
            return extendAttrH;
        }
        return "'" + extendAttrH + "'";
    }

    public UpItemRelat setExtendAttrH(String extendAttrH) {
        this.extendAttrH = extendAttrH;
        return this;
    }

    public String getExtendAttrI() {
        if (extendAttrI.equals("null")) {
            return extendAttrI;
        }
        return "'" + extendAttrI + "'";
    }

    public UpItemRelat setExtendAttrI(String extendAttrI) {
        this.extendAttrI = extendAttrI;
        return this;
    }

    public String getExtendAttrJ() {
        if (extendAttrJ.equals("null")) {
            return extendAttrJ;
        }
        return "'" + extendAttrJ + "'";
    }

    public UpItemRelat setExtendAttrJ(String extendAttrJ) {
        this.extendAttrJ = extendAttrJ;
        return this;
    }

    public String getExtendAttrK() {
        if (extendAttrK.equals("null")) {
            return extendAttrK;
        }
        return "'" + extendAttrK + "'";
    }

    public UpItemRelat setExtendAttrK(String extendAttrK) {
        this.extendAttrK = extendAttrK;
        return this;
    }

    public String getExtendAttrL() {
        if (extendAttrL.equals("null")) {
            return extendAttrL;
        }
        return "'" + extendAttrL + "'";
    }

    public UpItemRelat setExtendAttrL(String extendAttrL) {
        this.extendAttrL = extendAttrL;
        return this;
    }

    public String getExtendAttrM() {
        if (extendAttrM.equals("null")) {
            return extendAttrM;
        }
        return "'" + extendAttrM + "'";
    }

    public UpItemRelat setExtendAttrM(String extendAttrM) {
        this.extendAttrM = extendAttrM;
        return this;
    }

    public String getExtendAttrN() {
        if (extendAttrN.equals("null")) {
            return extendAttrN;
        }
        return "'" + extendAttrN + "'";
    }

    public UpItemRelat setExtendAttrN(String extendAttrN) {
        this.extendAttrN = extendAttrN;
        return this;
    }

    public String getExtendAttrO() {
        if (extendAttrO.equals("null")) {
            return extendAttrO;
        }
        return "'" + extendAttrO + "'";
    }

    public UpItemRelat setExtendAttrO(String extendAttrO) {
        this.extendAttrO = extendAttrO;
        return this;
    }

    public String getSortBy() {
        return sortBy;
    }

    public UpItemRelat setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public String getCreater() {
        return creater;
    }

    public UpItemRelat setCreater(String creater) {
        this.creater = creater;
        return this;
    }

    public String getCreateDate() {
        return createDate;
    }

    public UpItemRelat setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    public String getModifier() {
        return modifier;
    }

    public UpItemRelat setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public UpItemRelat setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
        return this;
    }

    public String getDelFlag() {
        if (delFlag.equals("null")) {
            return delFlag;
        }
        return "'" + delFlag + "'";
    }

    public UpItemRelat setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public String getApplyRegion() {
        if (applyRegion.equals("null")) {
            return applyRegion;
        }
        return "'" + applyRegion + "'";
    }

    public UpItemRelat setApplyRegion(String applyRegion) {
        this.applyRegion = applyRegion;
        return this;
    }

    public String getPriority() {
        return priority;
    }

    public UpItemRelat setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public String getTableName() {
        return tableName;
    }

    protected UpItemRelat setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String toInsertSql() {
        String relatItemSql = relatProductItem.toInsertSql();
        StringBuffer sqlBuf = new StringBuffer(relatItemSql);

        sqlBuf.append("insert into ").append(tableName).append("\n" +
                "  (item_relat_id,\n" +
                "   product_item_id,\n" +
                "   relat_product_item_id,\n" +
                "   prod_item_relat_kind_id,\n" +
                "   extend_attr_a,\n" +
                "   extend_attr_b,\n" +
                "   extend_attr_c,\n" +
                "   extend_attr_d,\n" +
                "   extend_attr_e,\n" +
                "   extend_attr_f,\n" +
                "   extend_attr_g,\n" +
                "   extend_attr_h,\n" +
                "   extend_attr_i,\n" +
                "   extend_attr_j,\n" +
                "   extend_attr_k,\n" +
                "   extend_attr_l,\n" +
                "   extend_attr_m,\n" +
                "   extend_attr_n,\n" +
                "   extend_attr_o,\n" +
                "   sort_by,\n" +
                "   creater,\n" +
                "   create_date,\n" +
                "   modifier,\n" +
                "   modify_date,\n" +
                "   del_flag,\n" +
                "   apply_region,\n" +
                "   priority)\n" +
                "values (\n")
                .append("   " + getItemRelatId() + ",\n")
                .append("   " + getProductItemId() + ",\n")
                .append("   " + getRelatProductItemId() + ",\n")
                .append("   " + getProdItemRelatKindId() + ",\n")
                .append("   " + getExtendAttrA() + ",\n")
                .append("   " + getExtendAttrB() + ",\n")
                .append("   " + getExtendAttrC() + ",\n")
                .append("   " + getExtendAttrD() + ",\n")
                .append("   " + getExtendAttrE() + ",\n")
                .append("   " + getExtendAttrF() + ",\n")
                .append("   " + getExtendAttrG() + ",\n")
                .append("   " + getExtendAttrH() + ",\n")
                .append("   " + getExtendAttrI() + ",\n")
                .append("   " + getExtendAttrJ() + ",\n")
                .append("   " + getExtendAttrK() + ",\n")
                .append("   " + getExtendAttrL() + ",\n")
                .append("   " + getExtendAttrM() + ",\n")
                .append("   " + getExtendAttrN() + ",\n")
                .append("   " + getExtendAttrO() + ",\n")
                .append("   " + getSortBy() + ",\n")
                .append("   " + getCreater() + ",\n")
                .append("   " + getCreateDate() + ",\n")
                .append("   " + getModifier() + ",\n")
                .append("   " + getModifyDate() + ",\n")
                .append("   " + getDelFlag() + ",\n")
                .append("   " + getApplyRegion() + ",\n")
                .append("   " + getPriority() + "\n")
                .append(");\n\n")
        ;

        return sqlBuf.toString();
    }
}
