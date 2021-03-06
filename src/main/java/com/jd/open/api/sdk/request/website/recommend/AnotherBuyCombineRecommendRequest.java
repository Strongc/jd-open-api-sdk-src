// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AnotherBuyCombineRecommendRequest.java

package com.jd.open.api.sdk.request.website.recommend;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.recommend.AnotherBuyCombineRecommendResponse;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AnotherBuyCombineRecommendRequest extends AbstractRequest
        implements JdRequest {

    public AnotherBuyCombineRecommendRequest() {
    }

    public String getApiMethod() {
        return "jingdong.anotherbuyrecommend.ware.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("ware_id", wareId);
        pmap.put("fields", fields);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return AnotherBuyCombineRecommendResponse.class;
    }

    public String getWareId() {
        return wareId;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    private String wareId;
    private String fields;
}
