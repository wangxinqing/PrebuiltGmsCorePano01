package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class k extends v {
    public k(bhm bhm, String str, String str2, aucd aucd, int i) {
        super(bhm, str, str2, aucd, i, 12);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        aucd aucd = this.g;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        c cVar = (c) aucd.b;
        c cVar2 = c.Q;
        cVar.a |= 2048;
        cVar.j = -1;
        aucd aucd2 = this.g;
        long longValue = ((Long) this.d.invoke((Object) null, new Object[]{this.a.a})).longValue();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        c cVar3 = (c) aucd2.b;
        cVar3.a |= 2048;
        cVar3.j = longValue;
    }
}
