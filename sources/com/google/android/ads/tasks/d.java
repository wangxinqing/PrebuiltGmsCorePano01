package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class d extends v {
    public d(bhm bhm, String str, String str2, aucd aucd, int i) {
        super(bhm, str, str2, aucd, i, 5);
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
        cVar.a |= 16;
        cVar.g = -1;
        aucd aucd2 = this.g;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        c cVar3 = (c) aucd2.b;
        cVar3.a |= 32;
        cVar3.h = -1;
        int[] iArr = (int[]) this.d.invoke((Object) null, new Object[]{this.a.a});
        synchronized (this.g) {
            aucd aucd3 = this.g;
            long j = (long) iArr[0];
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            c cVar4 = (c) aucd3.b;
            cVar4.a |= 16;
            cVar4.g = j;
            aucd aucd4 = this.g;
            long j2 = (long) iArr[1];
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            c cVar5 = (c) aucd4.b;
            cVar5.a |= 32;
            cVar5.h = j2;
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                aucd aucd5 = this.g;
                long j3 = (long) i;
                if (aucd5.c) {
                    aucd5.c();
                    aucd5.c = false;
                }
                c cVar6 = (c) aucd5.b;
                cVar6.b |= 2097152;
                cVar6.E = j3;
            }
        }
    }
}
