package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiBatch extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("activityReadings", FastJsonResponse$Field.b("activityReadings", ApiActivityReading.class));
        a.put("apiMetadatas", FastJsonResponse$Field.b("apiMetadatas", ApiMetadata.class));
        a.put("apiRates", FastJsonResponse$Field.b("apiRates", ApiRate.class));
        a.put("locationReadings", FastJsonResponse$Field.b("locationReadings", ApiLocationReading.class));
        a.put("phenotypeBeaconExperimentTokens", FastJsonResponse$Field.a("phenotypeBeaconExperimentTokens", ApiExperimentTokens.class));
        a.put("phenotypeFlpExperimentTokens", FastJsonResponse$Field.a("phenotypeFlpExperimentTokens", ApiExperimentTokens.class));
        a.put("phenotypeUlrExperimentTokens", FastJsonResponse$Field.a("phenotypeUlrExperimentTokens", ApiExperimentTokens.class));
        a.put("sensorData", FastJsonResponse$Field.a("sensorData", ApiSensorData.class));
        a.put("userDatas", FastJsonResponse$Field.b("userDatas", ApiUserData.class));
    }

    public ApiBatch() {
    }

    public final Map a() {
        return a;
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public ArrayList getActivityReadings() {
        return (ArrayList) this.d.get("activityReadings");
    }

    public ArrayList getApiMetadatas() {
        return (ArrayList) this.d.get("apiMetadatas");
    }

    public ArrayList getApiRates() {
        return (ArrayList) this.d.get("apiRates");
    }

    public ArrayList getLocationReadings() {
        return (ArrayList) this.d.get("locationReadings");
    }

    public ApiExperimentTokens getPhenotypeBeaconExperimentTokens() {
        return (ApiExperimentTokens) this.c.get("phenotypeBeaconExperimentTokens");
    }

    public ApiExperimentTokens getPhenotypeFlpExperimentTokens() {
        return (ApiExperimentTokens) this.c.get("phenotypeFlpExperimentTokens");
    }

    public ApiExperimentTokens getPhenotypeUlrExperimentTokens() {
        return (ApiExperimentTokens) this.c.get("phenotypeUlrExperimentTokens");
    }

    public ApiSensorData getSensorData() {
        return (ApiSensorData) this.c.get("sensorData");
    }

    public ArrayList getUserDatas() {
        return (ArrayList) this.d.get("userDatas");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    public ApiBatch(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ApiExperimentTokens apiExperimentTokens, ApiExperimentTokens apiExperimentTokens2, ApiExperimentTokens apiExperimentTokens3, ApiSensorData apiSensorData, ArrayList arrayList4) {
        if (arrayList != null) {
            a("activityReadings", arrayList);
        }
        a("apiMetadatas", arrayList2);
        if (arrayList3 != null) {
            a("locationReadings", arrayList3);
        }
        if (apiExperimentTokens != null) {
            a("phenotypeBeaconExperimentTokens", (jag) apiExperimentTokens);
        }
        if (apiExperimentTokens2 != null) {
            a("phenotypeFlpExperimentTokens", (jag) apiExperimentTokens2);
        }
        if (apiExperimentTokens3 != null) {
            a("phenotypeUlrExperimentTokens", (jag) apiExperimentTokens3);
        }
        a("sensorData", (jag) apiSensorData);
        a("userDatas", arrayList4);
    }

    public final void a(String str, ArrayList arrayList) {
        this.d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.d.containsKey(str);
    }
}
