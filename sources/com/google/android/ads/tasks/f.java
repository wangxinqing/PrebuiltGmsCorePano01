package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class f extends v {
    private final long h;

    public f(bhm bhm, String str, String str2, aucd aucd, long j, int i) {
        super(bhm, str, str2, aucd, i, 25);
        this.h = j;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        long longValue = ((Long) this.d.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.g) {
            aucd aucd = this.g;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            c cVar = (c) aucd.b;
            c cVar2 = c.Q;
            cVar.c |= 2048;
            cVar.O = longValue;
            long j = this.h;
            if (j != 0) {
                aucd aucd2 = this.g;
                long j2 = longValue - j;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                c cVar3 = (c) aucd2.b;
                cVar3.a |= 65536;
                cVar3.k = j2;
                aucd aucd3 = this.g;
                long j3 = this.h;
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                c cVar4 = (c) aucd3.b;
                cVar4.a |= 2097152;
                cVar4.n = j3;
            }
        }
    }
}
