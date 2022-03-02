package defpackage;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: zqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zqa implements aoqb {
    private final zqd a;

    public zqa(zqd zqd) {
        this.a = zqd;
    }

    public final aorr a(Object obj) {
        zqd zqd = this.a;
        zra zra = (zra) obj;
        String str = zra.a;
        long a2 = augk.a(zqd.h.a());
        aucx aucx = zra.c;
        Bundle bundle = zqd.g;
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (aucx.contains(str2)) {
                Object obj2 = bundle.get(str2);
                if (obj2 instanceof String) {
                    hashMap.put(str2, (String) obj2);
                } else {
                    throw new zoo("Only string values are allowed as an additional arg in RecaptchaAction");
                }
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 60);
                sb.append("AdditionalArgs key[ \"");
                sb.append(str2);
                sb.append("\" ] is not accepted by reCATPCHA server");
                throw new zoo(sb.toString());
            }
        }
        lya a3 = zqd.a.a();
        anab anab = new anab();
        anab.a("token", str);
        anab.a("action", zqd.e);
        anab.a("timestamp_millis", Long.toString(a2));
        anab.a((Iterable) hashMap.entrySet());
        if (!zqd.f.isEmpty()) {
            anab.a("verification_history_token", zqd.f);
        }
        return zqd.i.b(new zqb(zqd, str, a2, a3.a(anab.a()), hashMap));
    }
}
