// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataserviceShopuvtop15byweekGetResponse.java

package com.jd.open.api.sdk.response.udp;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.udp:
//            ShopUvResultDTO

public class DataserviceShopuvtop15byweekGetResponse extends AbstractResponse {

    public DataserviceShopuvtop15byweekGetResponse() {
    }

    public void setResultDTO(ShopUvResultDTO resultDTO) {
        this.resultDTO = resultDTO;
    }

    public ShopUvResultDTO getResultDTO() {
        return resultDTO;
    }

    private ShopUvResultDTO resultDTO;
}
