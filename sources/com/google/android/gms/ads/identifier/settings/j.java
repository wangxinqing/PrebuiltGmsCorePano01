package com.google.android.gms.ads.identifier.settings;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class j implements aoqb {
    private final p a;

    public j(p pVar) {
        this.a = pVar;
    }

    public final aorr a(Object obj) {
        p pVar = this.a;
        aosh f = aosh.f();
        byte[] k = ((aqpk) obj).k();
        aqpl aqpl = aqpl.b;
        f.getClass();
        l lVar = new l(f);
        f.getClass();
        izs izs = r4;
        izs izs2 = new izs(1, "https://deviceintegritytokens-pa.googleapis.com/v1/getAdEventToken?alt=PROTO&key=AIzaSyA8mcvQcsqT5QLTUyhjjH_DeDkTqP9u2_w", k, aqpl, lVar, new m(f), (String) null, (String) null, false, new HashMap(), 22272, -1);
        izs izs3 = izs;
        f.a((Runnable) new n(f, izs3), (Executor) pVar.b);
        pVar.a.add(izs3);
        return f;
    }
}
