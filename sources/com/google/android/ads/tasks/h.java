package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class h extends v {
    private static volatile Long h = null;
    private static final Object i = new Object();

    public h(bhm bhm, String str, String str2, aucd aucd, int i2) {
        super(bhm, str, str2, aucd, i2, 22);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (Long) this.d.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            aucd aucd = this.g;
            long longValue = h.longValue();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            c cVar = (c) aucd.b;
            c cVar2 = c.Q;
            cVar.a |= 1048576;
            cVar.m = longValue;
        }
    }
}
