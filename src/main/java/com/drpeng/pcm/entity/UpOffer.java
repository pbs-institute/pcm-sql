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

    private List<UpItemRelat> relatProducts = new ArrayList<UpItemRelat>();
    private List<UpItemRelat> relatOfferPlans = new ArrayList<UpItemRelat>();
    private List<UpItemRelat> relatPricePlans = new ArrayList<UpItemRelat>();
    private List<UpItemRelat> relatBusinesses = new ArrayList<UpItemRelat>();
    private List<UpItemRelat> relatSpecRoles = new ArrayList<UpItemRelat>();
    private List<UpItemCatalog> relatCatalogs = new ArrayList<UpItemCatalog>();
    private List<UpItemRegion> relatRegions = new ArrayList<UpItemRegion>();

    // ---- Methods of UpProductItem Begin ----
    public UpOffer setExtendId(String extendId) {
        this.extendId = extendId;
        return this;
    }

    public UpOffer setCode(String code) {
        this.code = code;
        return this;
    }

    public UpOffer setName(String name) {
        this.name = name;
        return this;
    }

    public UpOffer setAlphaName(String alphaName) {
        this.alphaName = alphaName;
        return this;
    }

    public UpOffer setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    public UpOffer setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public UpOffer setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public UpOffer setDescription(String description) {
        this.description = description;
        return this;
    }

    public UpOffer setCreater(String creater) {
        this.creater = creater;
        return this;
    }

    public UpOffer setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public UpOffer setState(String state) {
        this.state = state;
        return this;
    }

    public UpOffer setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public UpOffer setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public UpOffer setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    public UpOffer setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
        return this;
    }

    public UpOffer setEffDate(String effDate) {
        this.effDate = effDate;
        return this;
    }

    public UpOffer setExpDate(String expDate) {
        this.expDate = expDate;
        return this;
    }

    public UpOffer setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    public UpOffer setChecker(String checker) {
        this.checker = checker;
        return this;
    }

    public UpOffer setIslock(String islock) {
        this.islock = islock;
        return this;
    }

    public UpOffer setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public UpOffer setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    public UpOffer setBusinessDomainId(String businessDomainId) {
        this.businessDomainId = businessDomainId;
        return this;
    }

    public UpOffer setOperRegion(String operRegion) {
        this.operRegion = operRegion;
        return this;
    }

    public UpOffer setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public UpOffer addFeature(UpItemFeature relatFeature) {
        relatFeature.setProductItemId(productItemId);
        relatFeatures.add(relatFeature);
        return this;
    }
    // ---- Methods of UpProductItem End ----

    public UpOffer() {
        super(UpProductItem.ITEM_TYPE_OFFER_PLAN);
        this.offerId = super.getProductItemId();
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

    private UpOffer setOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    public UpOffer setOfferType(String offerType) {
        this.offerType = offerType;
        return this;
    }

    public UpOffer setPayType(String payType) {
        this.payType = payType;
        return this;
    }

    public UpOffer setTrademark(String trademark) {
        this.trademark = trademark;
        return this;
    }

    public UpOffer setBusiType(String busiType) {
        this.busiType = busiType;
        return this;
    }

    public UpOffer setOfferPlanType(String offerPlanType) {
        this.offerPlanType = offerPlanType;
        return this;
    }

    public UpOffer setProdSpecId(String prodSpecId) {
        this.prodSpecId = prodSpecId;
        return this;
    }

    public UpOffer setPackedFlag(String packedFlag) {
        this.packedFlag = packedFlag;
        return this;
    }

    public UpOffer setIsGlobal(String isGlobal) {
        this.isGlobal = isGlobal;
        return this;
    }

    public UpOffer setDailyEffect(String dailyEffect) {
        this.dailyEffect = dailyEffect;
        return this;
    }

    public UpOffer setStopDispose(String stopDispose) {
        this.stopDispose = stopDispose;
        return this;
    }

    public UpOffer addRelatProduct(UpItemRelat relatProduct) {
        relatProduct.setProdItemRelatKindId(UpPlanProdRel.OFFER_PLAN_INCLUDE_SRVC_SINGLE);
        relatProduct.setProductItemId(offerId);
        relatProducts.add(relatProduct);
        return this;
    }

    public UpOffer addRelatOfferPlan(UpItemRelat relatOfferPlan) {
        relatOfferPlan.setProductItemId(offerId);
        relatOfferPlans.add(relatOfferPlan);
        return this;
    }

    public UpOffer addRelatPricePlan(UpItemRelat relatPricePlan) {
        relatPricePlan.setProdItemRelatKindId(UpItemRelat.OFFER_PLAN_GENERAL_PRICE_PLAN_PKG_BUSI);
        relatPricePlan.setProductItemId(offerId);
        relatPricePlans.add(relatPricePlan);
        return this;
    }

    public UpOffer addRelatBusiness(UpItemRelat relatBusiness) {
        relatBusiness.setProdItemRelatKindId(UpItemRelat.OFFER_PLAN_GENERAL_BUSINESS);
        relatBusiness.setProductItemId(offerId);
        relatBusinesses.add(relatBusiness);
        return this;
    }

    public UpOffer addRelatSpecRole(UpItemRelat relatSpecRole) {
        relatSpecRole.setProdItemRelatKindId(UpItemRelat.OFFER_PLAN_GENERAL_SPEC_ROLE);
        relatSpecRole.setProductItemId(offerId);
        relatSpecRoles.add(relatSpecRole);
        return this;
    }

    public UpOffer addRelatCatalog(UpItemCatalog relatCatalog) {
        relatCatalog.setProductItemId(offerId);
        relatCatalogs.add(relatCatalog);
        return this;
    }

    public UpOffer addRelatRegion(UpItemRegion relatRegion) {
        relatRegion.setProductItemId(offerId);
        relatRegions.add(relatRegion);
        return this;
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

        for (UpItemRelat relatProduct : relatProducts) {
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

        for (UpItemRelat relatOfferPlan : relatOfferPlans) {
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
