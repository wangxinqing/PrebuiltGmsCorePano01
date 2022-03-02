package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiPlaceInferenceResult extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("inferences", FastJsonResponse$Field.b("inferences", ApiPlaceInference.class));
        a.put("personalized", FastJsonResponse$Field.e("personalized"));
        a.put("powerMode", FastJsonResponse$Field.f("powerMode"));
    }

    public ApiPlaceInferenceResult() {
    }

    public final Map a() {
        return a;
    }

    public final Boolean b() {
        return (Boolean) this.b.get("personalized");
    }

    public final String c() {
        return (String) this.b.get("powerMode");
    }

    public ArrayList getInferences() {
        return (ArrayList) this.c.get("inferences");
    }

    public final void a(String str, ArrayList arrayList) {
        this.c.put(str, arrayList);
    }

    public ApiPlaceInferenceResult(ArrayList arrayList, Boolean bool, String str) {
        a("inferences", arrayList);
        a("personalized", bool.booleanValue());
        a("powerMode", str);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.c.containsKey(str);
    }
}
