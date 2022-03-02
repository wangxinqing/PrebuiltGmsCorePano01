package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;
import com.google.android.gms.ads.internal.config.n;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class m extends v {
    public m(bhm bhm, String str, String str2, aucd aucd, int i) {
        super(bhm, str, str2, aucd, i, 3);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        bgu bgu = new bgu((String) this.d.invoke((Object) null, new Object[]{this.a.a, Boolean.valueOf(((Boolean) n.e.a()).booleanValue())}));
        synchronized (this.g) {
            aucd aucd = this.g;
            long j = bgu.a;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            c cVar = (c) aucd.b;
            c cVar2 = c.Q;
            cVar.a |= 4;
            cVar.f = j;
            aucd aucd2 = this.g;
            long j2 = bgu.b;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            c cVar3 = (c) aucd2.b;
            cVar3.b |= 4194304;
            cVar3.F = j2;
        }
    }
}
