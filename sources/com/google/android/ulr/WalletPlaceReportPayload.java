package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class WalletPlaceReportPayload extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("eventId", FastJsonResponse$Field.a("eventId", WalletUserEventId.class));
        a.put("instoreTransactionDetails", FastJsonResponse$Field.a("instoreTransactionDetails", WalletPlaceReportPayloadInstoreTransactionDetails.class));
        a.put("placeLikelihoodBuffers", FastJsonResponse$Field.b("placeLikelihoodBuffers", WalletPlaceReportPayloadPlaceIdLikelihood.class));
        a.put("userEvent", FastJsonResponse$Field.f("userEvent"));
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("userEvent");
    }

    public WalletUserEventId getEventId() {
        return (WalletUserEventId) this.c.get("eventId");
    }

    public WalletPlaceReportPayloadInstoreTransactionDetails getInstoreTransactionDetails() {
        return (WalletPlaceReportPayloadInstoreTransactionDetails) this.c.get("instoreTransactionDetails");
    }

    public ArrayList getPlaceLikelihoodBuffers() {
        return (ArrayList) this.d.get("placeLikelihoodBuffers");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public final void a(String str, ArrayList arrayList) {
        this.d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.d.containsKey(str);
    }
}
