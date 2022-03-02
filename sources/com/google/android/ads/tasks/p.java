package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class p extends v {
    private final boolean h;

    public p(bhm bhm, String str, String str2, aucd aucd, int i) {
        super(bhm, str, str2, aucd, i, 61);
        this.h = bhm.p.a;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        long longValue = ((Long) this.d.invoke((Object) null, new Object[]{this.a.a, Boolean.valueOf(this.h)})).longValue();
        synchronized (this.g) {
            aucd aucd = this.g;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            c cVar = (c) aucd.b;
            c cVar2 = c.Q;
            cVar.b |= 8388608;
            cVar.G = longValue;
        }
    }
}
