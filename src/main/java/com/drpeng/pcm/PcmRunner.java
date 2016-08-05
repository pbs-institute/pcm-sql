package com.drpeng.pcm;

import com.drpeng.pcm.entity.*;

/**
 * Created by huangxiaomao on 7/28/2016.
 */
public class PcmRunner {
    public static void configHomeOffer() throws Exception {
        // 创建2个新的服务
        UpService upServiceJtbxfw = new UpService();
        upServiceJtbxfw._setName("家庭包厢服务");
        upServiceJtbxfw._setDescription("家庭包厢服务");
        upServiceJtbxfw._setExtendId("10037");
        upServiceJtbxfw.setServiceType("27");
        upServiceJtbxfw.setServiceLevel("1");
        upServiceJtbxfw.setPsType("1");

        UpService upServiceJtbxmz = new UpService();
        upServiceJtbxmz._setName("家庭包厢模组");
        upServiceJtbxmz._setDescription("家庭包厢模组");
        upServiceJtbxmz._setExtendId("10040");
        upServiceJtbxmz.setServiceType("27");
        upServiceJtbxmz.setServiceLevel("2");
        upServiceJtbxmz.setPsType("1");

        // 创建2个新的产品
        UpServicePrice upServicePriceJtbx8yby = new UpServicePrice();
        upServicePriceJtbx8yby._setName("家庭包厢8元包月产品");
        upServicePriceJtbx8yby._setDescription("家庭包厢8元包月产品");
        upServicePriceJtbx8yby.setServicePriceKind(UpServicePrice.SERVICE_PRICE_KIND_PROD_SPROM);

        UpServicePrice upServicePriceJtbx8ybyfhm = new UpServicePrice();
        upServicePriceJtbx8ybyfhm._setName("家庭包厢8元包月副号码产品");
        upServicePriceJtbx8ybyfhm._setDescription("家庭包厢8元包月副号码产品");
        upServicePriceJtbx8ybyfhm.setServicePriceKind(UpServicePrice.SERVICE_PRICE_KIND_PROD_SPROM);
        upServicePriceJtbx8ybyfhm.addRelatService(new UpItemRelat(upServiceJtbxfw));

        UpServicePrice upServicePriceJtbxmfbdth = new UpServicePrice();
        upServicePriceJtbxmfbdth._setName("家庭包厢免费本地通话");
        upServicePriceJtbxmfbdth._setDescription("家庭包厢免费本地通话");
        upServicePriceJtbxmfbdth.setServicePriceKind(UpServicePrice.SERVICE_PRICE_KIND_PROD_SPROM);
        upServicePriceJtbxmfbdth.addRelatService(new UpItemRelat(upServiceJtbxmz));

        // 创建家庭包厢8元包月套餐
        UpOffer upOfferJtbx8yby = new UpOffer();
        upOfferJtbx8yby._setName("家庭包厢8元包月套餐");
        upOfferJtbx8yby._setDescription("家庭包厢8元包月套餐");
        upOfferJtbx8yby.setOfferType(UpOffer.OFFER_TYPE_OFFER_PLAN_JTW);
        upOfferJtbx8yby.setTrademark("161000000100");
        upOfferJtbx8yby.setProdSpecId("171000000001");

        // 套餐关联产品
        UpPlanProdRel relatServicePriceJtbx8yby = new UpPlanProdRel(upServicePriceJtbx8yby);
        relatServicePriceJtbx8yby.setExtendAttrF("181000000022");
        upOfferJtbx8yby.addRelatProduct(relatServicePriceJtbx8yby);

        UpPlanProdRel relatServicePriceJtbx8ybyfhm = new UpPlanProdRel(upServicePriceJtbx8ybyfhm);
        relatServicePriceJtbx8yby.setExtendAttrF("181000000023");
        upOfferJtbx8yby.addRelatProduct(relatServicePriceJtbx8ybyfhm);

        UpPlanProdRel relatServicePriceJtbxmfbdth = new UpPlanProdRel(upServicePriceJtbxmfbdth);
        relatServicePriceJtbxmfbdth.setExtendAttrF("181000000021");
        upOfferJtbx8yby.addRelatProduct(relatServicePriceJtbxmfbdth);

        // 套餐关联产品规格角色
        upOfferJtbx8yby.addRelatSpecRole(new UpItemRelat(new UpSpecRole("181000000021")));
        upOfferJtbx8yby.addRelatSpecRole(new UpItemRelat(new UpSpecRole("181000000022")));
        upOfferJtbx8yby.addRelatSpecRole(new UpItemRelat(new UpSpecRole("181000000023")));

        // 套餐关联业务操作
        upOfferJtbx8yby.addRelatBusiness(new UpItemRelat(new UpBusiness("191001009004")));
        upOfferJtbx8yby.addRelatBusiness(new UpItemRelat(new UpBusiness("191001009005")));
        upOfferJtbx8yby.addRelatBusiness(new UpItemRelat(new UpBusiness("191001009006")));
        upOfferJtbx8yby.addRelatBusiness(new UpItemRelat(new UpBusiness("191001009010")));
        upOfferJtbx8yby.addRelatBusiness(new UpItemRelat(new UpBusiness("191001009011")));

        // 套餐关联地市
        upOfferJtbx8yby.addRelatRegion(new UpItemRegion(new UpRegion("0")));

        // 套餐关联目录
        upOfferJtbx8yby.addRelatCatalog(new UpItemCatalog(new UpProdItemCatalog("212000001611")));

        //
        System.out.println(upOfferJtbx8yby.toInsertSql());

    }
    public static void main(String args[]) throws Exception {
        PcmRunner.configHomeOffer();
    }
}
