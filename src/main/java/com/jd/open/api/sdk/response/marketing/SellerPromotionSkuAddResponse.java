// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionSkuAddResponse.java

package com.jd.open.api.sdk.response.marketing;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class SellerPromotionSkuAddResponse extends AbstractResponse {

    public SellerPromotionSkuAddResponse() {
    }

    public void setIds(List ids) {
        this.ids = ids;
    }

    public List getIds() {
        return ids;
    }

    private List ids;
}
