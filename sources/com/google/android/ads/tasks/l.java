package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class l extends v {
    private static volatile String h = null;
    private static final Object i = new Object();

    public l(bhm bhm, String str, String str2, aucd aucd, int i2) {
        super(bhm, str, str2, aucd, i2, 1);
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
        "E".getClass();
        cVar.a |= 1;
        cVar.d = "E";
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (String) this.d.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            aucd aucd2 = this.g;
            String str = h;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            c cVar3 = (c) aucd2.b;
            str.getClass();
            cVar3.a |= 1;
            cVar3.d = str;
        }
    }
}
