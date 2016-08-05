package com.drpeng.pcm;

import com.drpeng.pcm.entity.*;

/**
 * Created by huangxiaomao on 7/28/2016.
 */
public class PcmRunner {
    public static void configHomeOffer() throws Exception {

        // 创建2个新的服务(在当前系统中不存在这两个服务，需要新建)
        UpService upServiceJtbxfw = new UpService()
                .setName("家庭包厢服务")
                .setDescription("家庭包厢服务")
                .setExtendId("10037")
                .setServiceType("27")
                .setServiceLevel("1")
                .setPsType("1");

        UpService upServiceJtbxmz = new UpService()
                .setName("家庭包厢模组")
                .setDescription("家庭包厢模组")
                .setExtendId("10040")
                .setServiceType("27")
                .setServiceLevel("2")
                .setPsType("1");

        // 创建3个新的产品：第一个产品不关联服务，后面两个关联上面的两个服务
        UpServicePrice upServicePriceJtbx8yby = new UpServicePrice()
                .setName("家庭包厢8元包月产品")
                .setDescription("家庭包厢8元包月产品")
                .setServicePriceKind(UpServicePrice.SERVICE_PRICE_KIND_PROD_SPROM);

        UpServicePrice upServicePriceJtbx8ybyfhm = new UpServicePrice()
                .setName("家庭包厢8元包月副号码产品")
                .setDescription("家庭包厢8元包月副号码产品")
                .setServicePriceKind(UpServicePrice.SERVICE_PRICE_KIND_PROD_SPROM)
                .addRelatService(new UpItemRelat(upServiceJtbxfw));

        UpServicePrice upServicePriceJtbxmfbdth = new UpServicePrice()
                .setName("家庭包厢免费本地通话")
                .setDescription("家庭包厢免费本地通话")
                .setServicePriceKind(UpServicePrice.SERVICE_PRICE_KIND_PROD_SPROM)
                .addRelatService(new UpItemRelat(upServiceJtbxmz));

        // 创建家庭包厢8元包月套餐
        UpOffer upOfferJtbx8yby = new UpOffer()
                .setName("家庭包厢8元包月套餐")
                .setDescription("家庭包厢8元包月套餐")
                .setOfferType(UpOffer.OFFER_TYPE_OFFER_PLAN_JTW)
                .setTrademark("161000000100")
                .setProdSpecId("171000000001");

        // 套餐关联前面的3个产品
        upOfferJtbx8yby
                .addRelatProduct(new UpPlanProdRel(upServicePriceJtbx8yby).setExtendAttrF("181000000022"))
                .addRelatProduct(new UpPlanProdRel(upServicePriceJtbx8ybyfhm).setExtendAttrF("181000000023"))
                .addRelatProduct(new UpPlanProdRel(upServicePriceJtbxmfbdth).setExtendAttrF("181000000021"));

        // 套餐关联3个产品规格角色（这几个规格角色在系统中已经存在，只需要关联）
        upOfferJtbx8yby
                .addRelatSpecRole(new UpItemRelat(new UpSpecRole("181000000021")))
                .addRelatSpecRole(new UpItemRelat(new UpSpecRole("181000000022")))
                .addRelatSpecRole(new UpItemRelat(new UpSpecRole("181000000023")));

        // 套餐关联业务操作（这些业务操作在系统中已经存在，只需要关联）
        upOfferJtbx8yby
                .addRelatBusiness(new UpItemRelat(new UpBusiness("191001009004")))
                .addRelatBusiness(new UpItemRelat(new UpBusiness("191001009005")))
                .addRelatBusiness(new UpItemRelat(new UpBusiness("191001009006")))
                .addRelatBusiness(new UpItemRelat(new UpBusiness("191001009010")))
                .addRelatBusiness(new UpItemRelat(new UpBusiness("191001009011")));

        // 套餐关联地市（北京和上海）
        upOfferJtbx8yby
                .addRelatRegion(new UpItemRegion(new UpRegion("110")))
                .addRelatRegion(new UpItemRegion(new UpRegion("210")));

        // 套餐关联目录（目录在系统中已存在，只需要关联）
        upOfferJtbx8yby.addRelatCatalog(new UpItemCatalog(new UpProdItemCatalog("212000001611")));

        //
        System.out.println(upOfferJtbx8yby.toInsertSql());

    }
    public static void main(String args[]) throws Exception {
        PcmRunner.configHomeOffer();
    }
}
