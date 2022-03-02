package defpackage;

import android.net.wifi.RttManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ahwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahwa implements RttManager.RttListener {
    final /* synthetic */ ahwe a;

    public ahwa(ahwe ahwe) {
        this.a = ahwe;
    }

    public final void onAborted() {
        ahwe ahwe = this.a;
        ahwe.c.a(false);
        ahwe.c.a(ahwe.b, ahwe.a, (List) null);
    }

    public final void onFailure(int i, String str) {
        ahwe ahwe = this.a;
        ahwe.c.a(false);
        ahwe.c.a(ahwe.b, ahwe.a, (List) null);
    }

    public final void onSuccess(RttManager.RttResult[] rttResultArr) {
        if (rttResultArr == null) {
            this.a.a(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList(r1);
        for (RttManager.RttResult rttResult : rttResultArr) {
            if (rttResult != null && rttResult.status == 0) {
                aibv aibv = new aibv();
                aibv.a = arvy.a(rttResult.bssid);
                aibv.e = rttResult.distance;
                aibv.f = rttResult.distanceStandardDeviation;
                aibv.d = rttResult.rssi;
                aibv.b = rttResult.status;
                aibv.c = rttResult.ts;
                aibv.g = rttResult.measurementType;
                aibv.h = rttResult.measurementFrameNumber;
                aibv.i = rttResult.successMeasurementFrameNumber;
                arrayList.add(aibv);
            }
        }
        this.a.a(arrayList);
    }
}
