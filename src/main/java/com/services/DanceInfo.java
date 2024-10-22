package com.services;
import java.util.Map;
import java.util.HashMap;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.util;
import org.apache.ofbiz.service.DispatchContext;


public class DanceInfo {
    public static final Map<String, Object> danceFormInformation(DispatchContext ctx, Map<String, Object> context) {

        Delegator delegator = ctx.getDelegator();
        String danceName = (String) context.get("danceName");
        GenericValue record = null;
        if (danceName != null){
            record = EntityQuery.use(delegator).from("dance").where("danceName", danceName).queryOne();
        }
        Map<String, Object> result = record.getAllFields();
        return result;
    }
 }