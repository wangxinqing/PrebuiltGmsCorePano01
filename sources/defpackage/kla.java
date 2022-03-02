package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: kla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kla {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final void a(kkz kkz) {
        iva.a(kkz.b >= 0);
        this.a.put(kkz.a, kkz);
        this.b.put(Long.valueOf(kkz.b), kkz);
    }
}
