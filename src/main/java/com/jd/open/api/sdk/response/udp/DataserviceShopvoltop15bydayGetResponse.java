// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataserviceShopvoltop15bydayGetResponse.java

package com.jd.open.api.sdk.response.udp;

import com.jd.open.api.sdk.domain.udp.ShopVolTop15Interface.ShopVolResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DataserviceShopvoltop15bydayGetResponse extends AbstractResponse {

    public DataserviceShopvoltop15bydayGetResponse() {
    }

    public void setResultDTO(ShopVolResultDTO resultDTO) {
        this.resultDTO = resultDTO;
    }

    public ShopVolResultDTO getResultDTO() {
        return resultDTO;
    }

    private ShopVolResultDTO resultDTO;
}
