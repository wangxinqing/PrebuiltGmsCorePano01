package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class j extends v {
    public j(bhm bhm, String str, String str2, aucd aucd, int i) {
        super(bhm, str, str2, aucd, i, 11);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        aucd aucd = this.g;
        long longValue = ((Long) this.d.invoke((Object) null, new Object[]{this.a.a})).longValue();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        c cVar = (c) aucd.b;
        c cVar2 = c.Q;
        cVar.a |= 1024;
        cVar.i = longValue;
    }
}
