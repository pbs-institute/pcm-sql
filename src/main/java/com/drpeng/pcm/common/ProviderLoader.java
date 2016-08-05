package com.drpeng.pcm.common;

/**
 * Created by huangxiaomao on 7/28/2016.
 */
public class ProviderLoader {

    private static IdGenerator idGeneratorInstance = IdGeneratorDefaultImpl.getInstance();

    public static IdGenerator getIdGeneratorInstance() {
        return idGeneratorInstance;
    }
}
