package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class o extends v {
    private List h = null;

    public o(bhm bhm, String str, String str2, aucd aucd, int i) {
        super(bhm, str, str2, aucd, i, 31);
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
        cVar.a |= 33554432;
        cVar.q = -1;
        aucd aucd2 = this.g;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        c cVar3 = (c) aucd2.b;
        cVar3.a |= 67108864;
        cVar3.r = -1;
        if (this.h == null) {
            this.h = (List) this.d.invoke((Object) null, new Object[]{this.a.a});
        }
        List list = this.h;
        if (list != null && list.size() == 2) {
            synchronized (this.g) {
                aucd aucd3 = this.g;
                long longValue = ((Long) this.h.get(0)).longValue();
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                c cVar4 = (c) aucd3.b;
                cVar4.a = 33554432 | cVar4.a;
                cVar4.q = longValue;
                aucd aucd4 = this.g;
                long longValue2 = ((Long) this.h.get(1)).longValue();
                if (aucd4.c) {
                    aucd4.c();
                    aucd4.c = false;
                }
                c cVar5 = (c) aucd4.b;
                cVar5.a |= 67108864;
                cVar5.r = longValue2;
            }
        }
    }
}
