package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiMetadata extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("activationChange", FastJsonResponse$Field.a("activationChange", ApiActivationChange.class));
        a.put("activityTransitionEventRecord", FastJsonResponse$Field.a("activityTransitionEventRecord", ApiActivityTransitionEventRecord.class));
        a.put("bleScanReport", FastJsonResponse$Field.a("bleScanReport", ApiBleScanReport.class));
        a.put("burstRequest", FastJsonResponse$Field.a("burstRequest", ApiBurstRequest.class));
        a.put("deviceConnectivitySetting", FastJsonResponse$Field.a("deviceConnectivitySetting", ApiDeviceConnectivitySetting.class));
        a.put("internalState", FastJsonResponse$Field.a("internalState", ApiInternalState.class));
        a.put("locationHistorianBatchData", FastJsonResponse$Field.a("locationHistorianBatchData", LocationHistorianBatchData.class));
        a.put("locationStatus", FastJsonResponse$Field.a("locationStatus", ApiLocationStatus.class));
        a.put("modelState", FastJsonResponse$Field.a("modelState", ApiModelState.class));
        a.put("placeInferenceResult", FastJsonResponse$Field.a("placeInferenceResult", ApiPlaceInferenceResult.class));
        a.put("placeReport", FastJsonResponse$Field.a("placeReport", ApiPlaceReport.class));
        a.put("rate", FastJsonResponse$Field.a("rate", ApiRate.class));
        a.put("stepCountsEntry", FastJsonResponse$Field.a("stepCountsEntry", ApiStepCountsEntry.class));
        a.put("timestampMs", FastJsonResponse$Field.b("timestampMs"));
        a.put("wifiConnectivityStatus", FastJsonResponse$Field.a("wifiConnectivityStatus", ApiWifiConnectivityStatus.class));
        a.put("wifiScans", FastJsonResponse$Field.b("wifiScans", WifiStrengthProto.class));
    }

    public ApiMetadata() {
    }

    public final Map a() {
        return a;
    }

    public final Long b() {
        return (Long) this.b.get("timestampMs");
    }

    public ApiActivationChange getActivationChange() {
        return (ApiActivationChange) this.c.get("activationChange");
    }

    public ApiActivityTransitionEventRecord getActivityTransitionEventRecord() {
        return (ApiActivityTransitionEventRecord) this.c.get("activityTransitionEventRecord");
    }

    public ApiBleScanReport getBleScanReport() {
        return (ApiBleScanReport) this.c.get("bleScanReport");
    }

    public ApiBurstRequest getBurstRequest() {
        return (ApiBurstRequest) this.c.get("burstRequest");
    }

    public ApiDeviceConnectivitySetting getDeviceConnectivitySetting() {
        return (ApiDeviceConnectivitySetting) this.c.get("deviceConnectivitySetting");
    }

    public ApiInternalState getInternalState() {
        return (ApiInternalState) this.c.get("internalState");
    }

    public LocationHistorianBatchData getLocationHistorianBatchData() {
        return (LocationHistorianBatchData) this.c.get("locationHistorianBatchData");
    }

    public ApiLocationStatus getLocationStatus() {
        return (ApiLocationStatus) this.c.get("locationStatus");
    }

    public ApiModelState getModelState() {
        return (ApiModelState) this.c.get("modelState");
    }

    public ApiPlaceInferenceResult getPlaceInferenceResult() {
        return (ApiPlaceInferenceResult) this.c.get("placeInferenceResult");
    }

    public ApiPlaceReport getPlaceReport() {
        return (ApiPlaceReport) this.c.get("placeReport");
    }

    public ApiRate getRate() {
        return (ApiRate) this.c.get("rate");
    }

    public ApiStepCountsEntry getStepCountsEntry() {
        return (ApiStepCountsEntry) this.c.get("stepCountsEntry");
    }

    public ApiWifiConnectivityStatus getWifiConnectivityStatus() {
        return (ApiWifiConnectivityStatus) this.c.get("wifiConnectivityStatus");
    }

    public ArrayList getWifiScans() {
        return (ArrayList) this.d.get("wifiScans");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public ApiMetadata(ApiActivationChange apiActivationChange, ApiBleScanReport apiBleScanReport, ApiDeviceConnectivitySetting apiDeviceConnectivitySetting, ApiInternalState apiInternalState, LocationHistorianBatchData locationHistorianBatchData, ApiLocationStatus apiLocationStatus, ApiPlaceInferenceResult apiPlaceInferenceResult, ApiPlaceReport apiPlaceReport, ApiRate apiRate, ApiStepCountsEntry apiStepCountsEntry, Long l, ApiWifiConnectivityStatus apiWifiConnectivityStatus, ArrayList arrayList) {
        if (apiActivationChange != null) {
            a("activationChange", (jag) apiActivationChange);
        }
        if (apiBleScanReport != null) {
            a("bleScanReport", (jag) apiBleScanReport);
        }
        if (apiDeviceConnectivitySetting != null) {
            a("deviceConnectivitySetting", (jag) apiDeviceConnectivitySetting);
        }
        if (apiInternalState != null) {
            a("internalState", (jag) apiInternalState);
        }
        if (locationHistorianBatchData != null) {
            a("locationHistorianBatchData", (jag) locationHistorianBatchData);
        }
        if (apiLocationStatus != null) {
            a("locationStatus", (jag) apiLocationStatus);
        }
        if (apiPlaceInferenceResult != null) {
            a("placeInferenceResult", (jag) apiPlaceInferenceResult);
        }
        if (apiPlaceReport != null) {
            a("placeReport", (jag) apiPlaceReport);
        }
        if (apiRate != null) {
            a("rate", (jag) apiRate);
        }
        if (apiStepCountsEntry != null) {
            a("stepCountsEntry", (jag) apiStepCountsEntry);
        }
        if (l != null) {
            a("timestampMs", l.longValue());
        }
        if (apiWifiConnectivityStatus != null) {
            a("wifiConnectivityStatus", (jag) apiWifiConnectivityStatus);
        }
        if (arrayList != null) {
            a("wifiScans", arrayList);
        }
    }

    public final void a(String str, ArrayList arrayList) {
        this.d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.d.containsKey(str);
    }
}
