package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class s extends v {
    public s(bhm bhm, String str, String str2, aucd aucd, int i) {
        super(bhm, str, str2, aucd, i, 48);
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
        cVar.z = 2;
        cVar.b |= 1024;
        boolean booleanValue = ((Boolean) this.d.invoke((Object) null, new Object[]{this.a.a})).booleanValue();
        synchronized (this.g) {
            if (booleanValue) {
                aucd aucd2 = this.g;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                c cVar3 = (c) aucd2.b;
                cVar3.z = 1;
                cVar3.b |= 1024;
            } else {
                aucd aucd3 = this.g;
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                c cVar4 = (c) aucd3.b;
                cVar4.z = 0;
                cVar4.b |= 1024;
            }
        }
    }
}
