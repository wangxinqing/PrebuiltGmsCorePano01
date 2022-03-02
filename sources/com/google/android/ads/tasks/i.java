package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class i extends v {
    public i(bhm bhm, String str, String str2, aucd aucd, int i) {
        super(bhm, str, str2, aucd, i, 76);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        int i = 1;
        boolean booleanValue = ((Boolean) this.d.invoke((Object) null, new Object[]{this.a.a})).booleanValue();
        aucd aucd = this.g;
        if (booleanValue) {
            i = 2;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        c cVar = (c) aucd.b;
        c cVar2 = c.Q;
        cVar.K = i - 1;
        cVar.c |= 16;
    }
}
