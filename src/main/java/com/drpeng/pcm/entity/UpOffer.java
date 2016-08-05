package com.drpeng.pcm.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangxiaomao on 8/3/2016.
 */
public class UpOffer extends UpProductItem {

    public static final String OFFER_TYPE_OFFER_PLAN_BROADBAND = "OFFER_PLAN_BROADBAND";
    public static final String OFFER_TYPE_OFFER_PLAN_GSM = "OFFER_PLAN_GSM";
    public static final String OFFER_TYPE_OFFER_VAS_BROADBAND = "OFFER_VAS_BROADBAND";
    public static final String OFFER_TYPE_OFFER_VAS_OTHER = "OFFER_VAS_OTHER";
    public static final String OFFER_TYPE_OFFER_VAS_PLOY = "OFFER_VAS_PLOY";
    public static final String OFFER_TYPE_OFFER_PLAN_JTW = "OFFER_PLAN_JTW";

    private String offerId = "null";
    private String offerType = "null";
    private String payType = "1";
    private String trademark = "null";
    private String busiType = "null";
    private String offerPlanType = "null";
    private String prodSpecId = "null";
    private String packedFlag = "null";
    private String isGlobal = "null";
    private String dailyEffect = "null";
    private String stopDispose = "null";
    private String modifyDate = "null";
    private String modifier = "null";
    private String createDate = "sysdate";
    private String creater = "10458";
    private String delFlag = "1";

    private List<UpPlanProdRel> relatProducts = new ArrayList<UpPlanProdRel>();
    private List<UpPlanPlanRel> relatOfferPlans = new ArrayList<UpPlanPlanRel>();
    private List<UpItemRelat> relatPricePlans = new ArrayList<UpItemRelat>();
    private List<UpItemRelat> relatBusinesses = new ArrayList<UpItemRelat>();
    private List<UpItemRelat> relatSpecRoles = new ArrayList<UpItemRelat>();
    private List<UpItemCatalog> relatCatalogs = new ArrayList<UpItemCatalog>();
    private List<UpItemRegion> relatRegions = new ArrayList<UpItemRegion>();

    public UpOffer() {
        super(UpProductItem.ITEM_TYPE_OFFER_PLAN);
        this.offerId = super._getProductItemId();
    }

    public UpOffer(String offerId) {
        super(offerId, UpProductItem.ITEM_TYPE_OFFER_PLAN);
        this.offerId = offerId;
    }

    public String getOfferId() {
        return offerId;
    }

    public String getOfferType() {
        if (offerType.equals("null")) {
            return offerType;
        }
        return "'" + offerType + "'";
    }

    public String getPayType() {
        if (payType.equals("null")) {
            return payType;
        }
        return "'" + payType + "'";
    }

    public String getTrademark() {
        return trademark;
    }

    public String getBusiType() {
        return busiType;
    }

    public String getOfferPlanType() {
        return offerPlanType;
    }

    public String getProdSpecId() {
        return prodSpecId;
    }

    public String getPackedFlag() {
        return packedFlag;
    }

    public String getIsGlobal() {
        return isGlobal;
    }

    public String getDailyEffect() {
        return dailyEffect;
    }

    public String getStopDispose() {
        return stopDispose;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public String getModifier() {
        return modifier;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getCreater() {
        return creater;
    }

    public String getDelFlag() {
        if (delFlag.equals("null")) {
            return delFlag;
        }
        return "'" + delFlag + "'";
    }

    private void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public void setOfferPlanType(String offerPlanType) {
        this.offerPlanType = offerPlanType;
    }

    public void setProdSpecId(String prodSpecId) {
        this.prodSpecId = prodSpecId;
    }

    public void setPackedFlag(String packedFlag) {
        this.packedFlag = packedFlag;
    }

    public void setIsGlobal(String isGlobal) {
        this.isGlobal = isGlobal;
    }

    public void setDailyEffect(String dailyEffect) {
        this.dailyEffect = dailyEffect;
    }

    public void setStopDispose(String stopDispose) {
        this.stopDispose = stopDispose;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public void addRelatProduct(UpPlanProdRel relatProduct) {
        relatProduct.setProdItemRelatKindId(UpPlanProdRel.OFFER_PLAN_INCLUDE_SRVC_SINGLE);
        relatProduct.setProductItemId(offerId);
        relatProducts.add(relatProduct);
    }

    public void addRelatOfferPlan(UpPlanPlanRel relatOfferPlan) {
        relatOfferPlan.setProductItemId(offerId);
        relatOfferPlans.add(relatOfferPlan);
    }

    public void addRelatPricePlan(UpItemRelat relatPricePlan) {
        relatPricePlan.setProdItemRelatKindId(UpItemRelat.OFFER_PLAN_GENERAL_PRICE_PLAN_PKG_BUSI);
        relatPricePlan.setProductItemId(offerId);
        relatPricePlans.add(relatPricePlan);
    }

    public void addRelatBusiness(UpItemRelat relatBusiness) {
        relatBusiness.setProdItemRelatKindId(UpItemRelat.OFFER_PLAN_GENERAL_BUSINESS);
        relatBusiness.setProductItemId(offerId);
        relatBusinesses.add(relatBusiness);
    }

    public void addRelatSpecRole(UpItemRelat relatSpecRole) {
        relatSpecRole.setProdItemRelatKindId(UpItemRelat.OFFER_PLAN_GENERAL_SPEC_ROLE);
        relatSpecRole.setProductItemId(offerId);
        relatSpecRoles.add(relatSpecRole);
    }

    public void addRelatCatalog(UpItemCatalog relatCatalog) {
        relatCatalog.setProductItemId(offerId);
        relatCatalogs.add(relatCatalog);
    }

    public void addRelatRegion(UpItemRegion relatRegion) {
        relatRegion.setProductItemId(offerId);
        relatRegions.add(relatRegion);
    }

    public String toInsertSql() {
        String superSql = super.toInsertSql();
        StringBuffer sqlBuf = new StringBuffer(superSql);

        if (isNew()) {
            sqlBuf.append("insert into product.up_offer\n" +
                    "  (offer_id,\n" +
                    "   offer_type,\n" +
                    "   pay_type,\n" +
                    "   trademark,\n" +
                    "   busi_type,\n" +
                    "   offer_plan_type,\n" +
                    "   prod_spec_id,\n" +
                    "   packed_flag,\n" +
                    "   is_global,\n" +
                    "   daily_effect,\n" +
                    "   stop_dispose,\n" +
                    "   modify_date,\n" +
                    "   modifier,\n" +
                    "   create_date,\n" +
                    "   creater,\n" +
                    "   del_flag)\n" +
                    "values (\n")
                    .append("   " + getOfferId() + ",\n")
                    .append("   " + getOfferType() + ",\n")
                    .append("   " + getPayType() + ",\n")
                    .append("   " + getTrademark() + ",\n")
                    .append("   " + getBusiType() + ",\n")
                    .append("   " + getOfferPlanType() + ",\n")
                    .append("   " + getProdSpecId() + ",\n")
                    .append("   " + getPackedFlag() + ",\n")
                    .append("   " + getIsGlobal() + ",\n")
                    .append("   " + getDailyEffect() + ",\n")
                    .append("   " + getStopDispose() + ",\n")
                    .append("   " + getModifyDate() + ",\n")
                    .append("   " + getModifier() + ",\n")
                    .append("   " + getCreateDate() + ",\n")
                    .append("   " + getCreater() + ",\n")
                    .append("   " + getDelFlag() + "\n")
                    .append(");\n\n")
            ;
        }

        for (UpPlanProdRel relatProduct : relatProducts) {
            sqlBuf.append(relatProduct.toInsertSql());
        }

        for (UpItemRelat relatBusiness : relatBusinesses) {
            sqlBuf.append(relatBusiness.toInsertSql());
        }

        for (UpItemRelat relatSpecRole : relatSpecRoles) {
            sqlBuf.append(relatSpecRole.toInsertSql());
        }

        for (UpItemRelat relatPricePlan : relatPricePlans) {
            sqlBuf.append(relatPricePlan.toInsertSql());
        }

        for (UpPlanPlanRel relatOfferPlan : relatOfferPlans) {
            sqlBuf.append(relatOfferPlan.toInsertSql());
        }

        for (UpItemCatalog relatCatalog : relatCatalogs) {
            sqlBuf.append(relatCatalog.toInsertSql());
        }

        for (UpItemRegion relatRegion : relatRegions) {
            sqlBuf.append(relatRegion.toInsertSql());
        }

        return sqlBuf.toString();
    }
}
